package com.demo.apiservice.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.demo.apiservice.pojo.entity.Notice;
import com.demo.apiservice.service.NoticeService;
import com.demo.apiservice.utils.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Tag(name = "通知接口", description = "发送通知，通知列表")
@CrossOrigin
@RestController
@RequestMapping("/api/notice")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @Operation(summary = "举通知分页查询", description = "通知分页查询")
    @PostMapping("/page/{pageNo}/{pageSize}")
    public R<IPage<Notice>> getReportPage(@PathVariable("pageNo") int pageNo, @PathVariable("pageSize") int pageSize, @RequestBody Notice notice) {
        IPage<Notice> reportList = noticeService.getNoticePage(notice, pageNo, pageSize);
        return R.success(reportList);
    }

    @Operation(summary = "通知", description = "填写通知人Id,通知内容等")
    @PostMapping("/save")
    public R<Boolean> report(@RequestBody Notice notice) {
        boolean result = noticeService.save(notice);
        return result ? R.success(result) : R.error("保存失败请重试!");
    }

    @Operation(summary = "删除", description = "删除通知")
    @DeleteMapping("/remove/{id}")
    public R<Boolean> remove(@PathVariable Long id) {
        boolean result = noticeService.removeById(id);
        return result ? R.success(result) : R.error("删除失败请重试!");
    }
}