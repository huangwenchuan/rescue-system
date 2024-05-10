package com.demo.apiservice.pojo.bo;

import com.demo.apiservice.pojo.dto.InfoDto;
import com.demo.apiservice.pojo.dto.UserDto;

public class InfoBO {
    /**
     * 信息
     */
    private InfoDto infoDto;


    /**
     * 信息发布者
     */
    private UserDto userDto;


    public InfoDto getInfoDto() {
        return infoDto;
    }

    public void setInfoDto(InfoDto infoDto) {
        this.infoDto = infoDto;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
}
