package com.demo.apiservice.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.demo.apiservice.pojo.bo.ReportBO;
import com.demo.apiservice.pojo.entity.Report;
import com.demo.apiservice.service.ReportService;
import com.demo.apiservice.utils.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Tag(name = "举报接口", description = "微信小程序举报用户接口")
@CrossOrigin
@RestController
@RequestMapping("/api/report")
public class ReportController {
    private ReportService reportService;

    @Autowired
    public void setReportService(ReportService reportService) {
        this.reportService = reportService;
    }

    @Operation(summary = "举报分页查询", description = "举报分页查询")
    @PostMapping("/page/{pageNo}/{pageSize}")
    public R<IPage<ReportBO>> getReportPage(@PathVariable("pageNo") int pageNo, @PathVariable("pageSize") int pageSize, @RequestBody Report report) {
        IPage<ReportBO> reportList = reportService.getReportPage(report, pageNo, pageSize);
        return R.success(reportList);
    }

    @Operation(summary = "举报", description = "填写举报类型,详情描述,举报证据等")
    @PostMapping("/save")
    public R<Boolean> report(@RequestBody Report report) {
        report.setLastModifierUserId(report.getCreatorUserId());
        boolean result = reportService.save(report);
        return result ? R.success(result) : R.error("保存失败请重试!");
    }

}
