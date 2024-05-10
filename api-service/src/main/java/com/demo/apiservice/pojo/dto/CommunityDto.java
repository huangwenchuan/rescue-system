package com.demo.apiservice.pojo.dto;

import java.util.List;

public class CommunityDto extends BaseDto {
    /**
     * 正文
     */
    private String context;

    /**
     * 地址
     */
    private String address;

    /**
     * 图片
     */
    private List<String> images;

    /**
     * 帖子分类
     */
    private Integer category;

    /**
     * 视频
     */
    private List<String> videos;

    /**
     * 标题
     */
    private String title;

    /**
     * 正文
     */
    public String getContext() {
        return context;
    }

    /**
     * 正文
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 图片
     */
    public List<String> getImages() {
        return images;
    }

    /**
     * 图片
     */
    public void setImages(List<String> images) {
        this.images = images;
    }

    /**
     * 帖子分类
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * 帖子分类
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * 视频
     */
    public List<String> getVideos() {
        return videos;
    }

    /**
     * 视频
     */
    public void setVideos(List<String> videos) {
        this.videos = videos;
    }

    /**
     *
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
