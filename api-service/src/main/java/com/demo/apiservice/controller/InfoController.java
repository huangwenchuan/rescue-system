package com.demo.apiservice.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.demo.apiservice.pojo.bo.InfoBO;
import com.demo.apiservice.pojo.dto.InfoDto;
import com.demo.apiservice.pojo.entity.Info;
import com.demo.apiservice.service.InfoService;
import com.demo.apiservice.utils.FileUtil;
import com.demo.apiservice.utils.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@Tag(name = "信息接口", description = "发布送养信息、寻宠信息、寻主信息")
@CrossOrigin
@RestController
@RequestMapping("/api/info")
public class InfoController {

    private InfoService infoService;
    @Autowired
    private FileUtil fileUtil;

    @Autowired
    public void setInfoService(InfoService infoService) {
        this.infoService = infoService;
    }

    @Operation(summary = "(发布/编辑)信息", description = "(发布/编辑)送养信息(infoType=0)、寻宠信息(infoType=1)、寻主信息(infoType=2)")
    @PostMapping("/save")
    public R<Boolean> saveInfo(@RequestBody InfoDto infoDto) {
        boolean result = false;
        try {
            result = infoService.saveInfo(infoDto);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result ? R.success(result) : R.error("保存失败请重试!");
    }

    @Operation(summary = "查询信息", description = "分页查询、条件查询")
    @PostMapping("/page/{pageNo}/{pageSize}")
    public R<IPage<InfoBO>> getInfoPage(@RequestBody InfoDto dto,
                                        @PathVariable("pageNo") int pageNo,
                                        @PathVariable("pageSize") int pageSize) {
        IPage<InfoBO> result = infoService.getInfoPage(dto, pageNo, pageSize);
        return R.success(result);
    }

    @Operation(summary = "删除信息", description = "根据信息Id逻辑删除发布信息")
    @DeleteMapping("/remove/{id}")
    public R<Boolean> removePost(@PathVariable("id") Long id) {
        Info info = infoService.getById(id);
        //info.setDeleterUserId(info.getCreatorUserId());
        //info.setLastModifierUserId(info.getCreatorUserId());
        //info.setDeletionTime(new Date());
        //boolean result = infoService.updateById(info) && infoService.removeById(id);
        boolean result = infoService.removeById(id)
                && fileUtil.removeFile(info.getImages())
                && fileUtil.removeFile(info.getVideos());
        return result ? R.success(result) : R.error("删除失败请重试!");
    }
}
