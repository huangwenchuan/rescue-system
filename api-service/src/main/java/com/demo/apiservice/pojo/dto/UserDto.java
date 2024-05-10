package com.demo.apiservice.pojo.dto;

public class UserDto extends BaseDto {
    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 身份证号
     */
    private String idCard;
    /**
     * 性别
     */
    private String gender;
    /**
     * 地址
     */
    private String location;
    /**
     * 头像地址
     */
    private String avatarUrl;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
