package com.demo.apiservice.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.demo.apiservice.pojo.bo.CommunityBO;
import com.demo.apiservice.pojo.dto.CommunityDto;
import com.demo.apiservice.pojo.entity.Community;
import com.demo.apiservice.service.CommunityService;
import com.demo.apiservice.utils.FileUtil;
import com.demo.apiservice.utils.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@Tag(name = "社区接口", description = "发帖、删贴")
@CrossOrigin
@RestController
@RequestMapping("/api/community")
public class CommunityController {
    private CommunityService communityService;
    @Autowired
    private FileUtil fileUtil;

    @Autowired
    public void setCommunityService(CommunityService communityService) {
        this.communityService = communityService;
    }

    @Operation(summary = "查询帖子", description = "分页查询、条件查询(没有使用)")
    @PostMapping("/page/{pageNo}/{pageSize}")
    public R<IPage<CommunityBO>> getCommunityPage(@RequestBody CommunityDto dto, @PathVariable("pageNo") int pageNo, @PathVariable("pageSize") int pageSize) {
        IPage<CommunityBO> result = communityService.getCommunityPage(dto, pageNo, pageSize);
        return R.success(result);
    }

    @Operation(summary = "(发布/编辑)帖子", description = "发布帖子、编辑帖子")
    @PostMapping("/save")
    public R<Boolean> savePost(@RequestBody CommunityDto communityDto) {
        boolean result = false;
        try {
            result = communityService.saveCommunity(communityDto);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result ? R.success(result) : R.error("保存失败请重试!");
    }

    @Operation(summary = "删除帖子", description = "根据帖子Id逻辑删除帖子")
    @DeleteMapping("/remove/{id}")
    public R<Boolean> removePost(@PathVariable("id") Long id) {
        Community community = communityService.getById(id);
        //community.setIsRemove(1);
        //community.setDeleterUserId(community.getCreatorUserId());
        //community.setLastModifierUserId(community.getCreatorUserId());
        //community.setDeletionTime(new Date());
        //boolean result = communityService.updateById(community) && communityService.removeById(id);

        boolean result = communityService.removeById(id)
                && fileUtil.removeFile(community.getImages())
                && fileUtil.removeFile(community.getVideos());
        return result ? R.success(result) : R.error("删除失败请重试!");
    }
}
