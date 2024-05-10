package com.demo.apiservice.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.demo.apiservice.pojo.bo.CommentBO;
import com.demo.apiservice.pojo.entity.CommunityComment;
import com.demo.apiservice.service.CommunityCommentService;
import com.demo.apiservice.utils.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Tag(name = "社区帖子评论接口", description = "发评、删评")
@RestController
@RequestMapping("/api/comment")
public class CommentController {
    private CommunityCommentService communityCommentService;

    @Autowired
    public void setCommunityCommentService(CommunityCommentService communityCommentService) {
        this.communityCommentService = communityCommentService;
    }

    @Operation(summary = "帖子评论分页查询", description = "帖子评论分页查询")
    @PostMapping("/page/{pageNo}/{pageSize}")
    public R<IPage<CommentBO>> getCommentPage(@RequestBody CommunityComment comment, @PathVariable("pageNo") int pageNo, @PathVariable("pageSize") int pageSize) {
        IPage<CommentBO> commentList = communityCommentService.getCommentPage(comment, pageNo, pageSize);
        return R.success(commentList);
    }

    @Operation(summary = "发布评论", description = "发布评论")
    @PostMapping("/save")
    public R<Boolean> saveComment(@RequestBody CommunityComment communityComment) {
        communityComment.setLastModifierUserId(communityComment.getCreatorUserId());
        boolean result = communityCommentService.saveOrUpdate(communityComment);
        return result ? R.success(result) : R.error("保存失败请重试!");
    }

    @Operation(summary = "删除评论", description = "根据评论Id逻辑删除帖子")
    @DeleteMapping("/remove/{id}")
    public R<Boolean> removeComment(@PathVariable("id") Long id) {
        CommunityComment communityComment = communityCommentService.getById(id);
        //communityComment.setIsRemove(1);
        communityComment.setDeleterUserId(communityComment.getCreatorUserId());
        communityComment.setDeletionTime(new Date());
        boolean result = communityCommentService.updateById(communityComment) && communityCommentService.removeById(communityComment);
        return result ? R.success(result) : R.error("删除失败请重试!");
    }
}
