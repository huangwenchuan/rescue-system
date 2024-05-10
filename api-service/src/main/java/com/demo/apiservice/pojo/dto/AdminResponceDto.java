package com.demo.apiservice.pojo.dto;

import com.demo.apiservice.pojo.entity.UserAdmin;

public class AdminResponceDto {
    private String token;
    private UserAdmin userAdmin;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UserAdmin getUserAdmin() {
        return userAdmin;
    }

    public void setUserAdmin(UserAdmin userAdmin) {
        this.userAdmin = userAdmin;
    }
}
