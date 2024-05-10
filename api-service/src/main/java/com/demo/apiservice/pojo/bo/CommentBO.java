package com.demo.apiservice.pojo.bo;

import com.demo.apiservice.pojo.dto.UserDto;
import com.demo.apiservice.pojo.entity.CommunityComment;

public class CommentBO {
    private CommunityComment communityComment;
    private UserDto userDto;

    public CommunityComment getCommunityComment() {
        return communityComment;
    }

    public void setCommunityComment(CommunityComment communityComment) {
        this.communityComment = communityComment;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
}
