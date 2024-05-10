package com.demo.apiservice.pojo.dto;

import java.util.List;

public class InfoDto extends BaseDto {
    /**
     * 性别（0=女孩, 1=男孩, 2=其它）
     */
    private Integer gender;

    /**
     * 地址
     */
    private String address;

    /**
     * 疫苗接种状态（0=已接种, 1=未接种, 3=接种中, 4=不详）
     */
    private Integer vaccination;

    /**
     * 体型（0=迷你, 1=小型, 2=中型, 3=大型）
     */
    private Integer shape;

    /**
     * 绝育状态（0=已绝育, 1=未绝育, 2=不详）
     */
    private Integer sterilization;

    /**
     * 毛发状态（0=长发, 1=短发, 2=卷毛, 3=无毛）
     */
    private Integer hair;

    /**
     * 动物图片路径
     */
    private List<String> images;

    /**
     * 动物视频路径
     */
    private List<String> videos;

    /**
     * 信息类型（0=送养信息, 1=寻宠信息, 2=寻主信息）
     */
    private Integer infoType;

    /**
     * 标题
     */
    private String title;

    /**
     * 描述
     */
    private String context;

    /**
     * 动物类型（0=猫猫, 1=狗狗, 2=其它）
     */
    private Integer category;

    /**
     * 动物年龄（0=幼年(0-1岁), 1=成年(2-10岁), 2=老年(10岁以上)）
     */
    private Integer age;

    /**
     * 驱虫情况（0=已驱虫, 1=未驱虫, 2=不详）
     */
    private Integer deworm;

    /**
     * 特点
     */
    private List<String> feature;

    /**
     * 要求
     */
    private List<String> ask;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 微信号
     */
    private String wechatNumber;

    /**
     * QQ号
     */
    private String qqNumber;


    /**
     * 宠物昵称
     */
    private String nickname;

    /**
     * 领养方式[0=无偿,1=红包,2=押金]
     */
    private Integer manner;

    /**
     * (红包/押金)(数字,面议)
     */
    private String reward;
    /**
     * 押金的退还条件
     */
    private String returnReward;
    /**
     * (丢失/拾得)时间
     */
    private String animalTime;

    public Integer getManner() {
        return manner;
    }

    public void setManner(Integer manner) {
        this.manner = manner;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public String getReturnReward() {
        return returnReward;
    }

    public void setReturnReward(String returnReward) {
        this.returnReward = returnReward;
    }

    public String getAnimalTime() {
        return animalTime;
    }

    public void setAnimalTime(String animalTime) {
        this.animalTime = animalTime;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getVaccination() {
        return vaccination;
    }

    public void setVaccination(Integer vaccination) {
        this.vaccination = vaccination;
    }

    public Integer getShape() {
        return shape;
    }

    public void setShape(Integer shape) {
        this.shape = shape;
    }

    public Integer getSterilization() {
        return sterilization;
    }

    public void setSterilization(Integer sterilization) {
        this.sterilization = sterilization;
    }

    public Integer getHair() {
        return hair;
    }

    public void setHair(Integer hair) {
        this.hair = hair;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<String> getVideos() {
        return videos;
    }

    public void setVideos(List<String> videos) {
        this.videos = videos;
    }

    public Integer getInfoType() {
        return infoType;
    }

    public void setInfoType(Integer infoType) {
        this.infoType = infoType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDeworm() {
        return deworm;
    }

    public void setDeworm(Integer deworm) {
        this.deworm = deworm;
    }

    public List<String> getFeature() {
        return feature;
    }

    public void setFeature(List<String> feature) {
        this.feature = feature;
    }

    public List<String> getAsk() {
        return ask;
    }

    public void setAsk(List<String> ask) {
        this.ask = ask;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWechatNumber() {
        return wechatNumber;
    }

    public void setWechatNumber(String wechatNumber) {
        this.wechatNumber = wechatNumber;
    }

    public String getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}

