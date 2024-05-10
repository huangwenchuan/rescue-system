package com.demo.apiservice.pojo.bo;

import com.demo.apiservice.pojo.dto.CommunityDto;
import com.demo.apiservice.pojo.dto.UserDto;

public class CommunityBO {
    /**
     * 帖子
     */
    private CommunityDto communityDto;
    /**
     * 发帖人
     */
    private UserDto userDto;

    public CommunityDto getCommunityDto() {
        return communityDto;
    }

    public void setCommunityDto(CommunityDto communityDto) {
        this.communityDto = communityDto;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
}
