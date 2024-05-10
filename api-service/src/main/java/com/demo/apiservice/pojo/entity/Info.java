package com.demo.apiservice.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 动物详情表
 * 用来发布送养动物信息
 *
 * @TableName animal
 */
@TableName(value = "info")
public class Info extends BaseEntity implements Serializable {
    /**
     * 性别(0=女孩,1=男孩,2=其它)
     */
    @TableField(value = "gender")
    private Integer gender;

    /**
     * 地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 疫苗接种(0=已接种,1=未接种,3=接种中,4=不详)
     */
    @TableField(value = "vaccination")
    private Integer vaccination;

    /**
     * 体型(0=迷你,1=小型,2=中型,3=大型)
     */
    @TableField(value = "shape")
    private Integer shape;

    /**
     * 绝育状态(0=已绝育,1=未绝育,2=不详)
     */
    @TableField(value = "sterilization")
    private Integer sterilization;

    /**
     * 毛发状态(0=长发,1=短发,2=卷毛,3=无毛)
     */
    @TableField(value = "hair")
    private Integer hair;

    /**
     * 动物图片
     */
    @TableField(value = "images")
    private String images;

    /**
     * 动物视频
     */
    @TableField(value = "videos")
    private String videos;

    /**
     * 信息类型(0=送养信息,1=寻宠信息,2=寻主信息)
     */
    @TableField(value = "info_type")
    private Integer infoType;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 描述
     */
    @TableField(value = "context")
    private String context;

    /**
     * 动物类型(0=猫猫,1=狗狗,2=其它)
     */
    @TableField(value = "category")
    private Integer category;

    /**
     * 动物年龄(0=幼年,1=成年,2=老年)
     */
    @TableField(value = "age")
    private Integer age;

    /**
     * 驱虫(0=已驱虫,1=未驱虫,2=不详)
     */
    @TableField(value = "deworm")
    private Integer deworm;

    /**
     * 特点
     */
    @TableField(value = "feature")
    private String feature;

    /**
     * 要求
     */
    @TableField(value = "ask")
    private String ask;

    /**
     * 联系电话
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 微信号
     */
    @TableField(value = "wechat_number")
    private String wechatNumber;

    /**
     * QQ号
     */
    @TableField(value = "qq_number")
    private String qqNumber;

    /**
     * 宠物昵称
     */
    @TableField(value = "nickname")
    private String nickname;
    /**
     * 领养方式[0=无偿,1=红包,2=押金]
     */
    @TableField(value = "manner")
    private Integer manner;
    /**
     * (红包/押金)(数字,面议)
     */
    @TableField(value = "reward")
    private String reward;
    /**
     * 押金的退还条件
     */
    @TableField(value = "return_reward")
    private String returnReward;
    /**
     * (丢失/拾得)时间
     */
    @TableField(value = "animal_time")
    private Date animalTime;

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

    public Date getAnimalTime() {
        return animalTime;
    }

    public void setAnimalTime(Date animalTime) {
        this.animalTime = animalTime;
    }

    /**
     * 性别(0=女孩,1=男孩,2=其它)
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 性别(0=女孩,1=男孩,2=其它)
     */
    public void setGender(Integer gender) {
        this.gender = gender;
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
     * 疫苗接种(0=已接种,1=未接种,3=接种中,4=不详)
     */
    public Integer getVaccination() {
        return vaccination;
    }

    /**
     * 疫苗接种(0=已接种,1=未接种,3=接种中,4=不详)
     */
    public void setVaccination(Integer vaccination) {
        this.vaccination = vaccination;
    }

    /**
     * 体型(0=迷你,1=小型,2=中型,3=大型)
     */
    public Integer getShape() {
        return shape;
    }

    /**
     * 体型(0=迷你,1=小型,2=中型,3=大型)
     */
    public void setShape(Integer shape) {
        this.shape = shape;
    }

    /**
     * 绝育状态(0=已绝育,1=未绝育,2=不详)
     */
    public Integer getSterilization() {
        return sterilization;
    }

    /**
     * 绝育状态(0=已绝育,1=未绝育,2=不详)
     */
    public void setSterilization(Integer sterilization) {
        this.sterilization = sterilization;
    }

    /**
     * 毛发状态(0=长发,1=短发,2=卷毛,3=无毛)
     */
    public Integer getHair() {
        return hair;
    }

    /**
     * 毛发状态(0=长发,1=短发,2=卷毛,3=无毛)
     */
    public void setHair(Integer hair) {
        this.hair = hair;
    }

    /**
     * 动物图片
     */
    public String getImages() {
        return images;
    }

    /**
     * 动物图片
     */
    public void setImages(String images) {
        this.images = images;
    }

    /**
     * 动物视频
     */
    public String getVideos() {
        return videos;
    }

    /**
     * 动物视频
     */
    public void setVideos(String videos) {
        this.videos = videos;
    }

    /**
     * 信息类型(0=送养信息,1=寻宠信息,2=寻主信息)
     */
    public Integer getInfoType() {
        return infoType;
    }

    /**
     * 信息类型(0=送养信息,1=寻宠信息,2=寻主信息)
     */
    public void setInfoType(Integer infoType) {
        this.infoType = infoType;
    }

    /**
     * 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 描述
     */
    public String getContext() {
        return context;
    }

    /**
     * 描述
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * 动物类型(0=猫猫,1=狗狗,2=其它)
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * 动物类型(0=猫猫,1=狗狗,2=其它)
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * 动物年龄(0=幼年,1=成年,2=老年)
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 动物年龄(0=幼年,1=成年,2=老年)
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 驱虫(0=已驱虫,1=未驱虫,2=不详)
     */
    public Integer getDeworm() {
        return deworm;
    }

    /**
     * 驱虫(0=已驱虫,1=未驱虫,2=不详)
     */
    public void setDeworm(Integer deworm) {
        this.deworm = deworm;
    }

    /**
     * 特点
     */
    public String getFeature() {
        return feature;
    }

    /**
     * 特点
     */
    public void setFeature(String feature) {
        this.feature = feature;
    }

    /**
     * 要求
     */
    public String getAsk() {
        return ask;
    }

    /**
     * 要求
     */
    public void setAsk(String ask) {
        this.ask = ask;
    }

    /**
     * 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 微信号
     */
    public String getWechatNumber() {
        return wechatNumber;
    }

    /**
     * 微信号
     */
    public void setWechatNumber(String wechatNumber) {
        this.wechatNumber = wechatNumber;
    }

    /**
     * QQ号
     */
    public String getQqNumber() {
        return qqNumber;
    }

    /**
     * QQ号
     */
    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber;
    }

    /**
     * 宠物昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 宠物昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}