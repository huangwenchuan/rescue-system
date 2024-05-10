package com.demo.apiservice.pojo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

public class BaseEntity {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 创建时间
     */

    @TableField(value = "creation_time", fill = FieldFill.INSERT)
    private Date creationTime;
    /**
     * 修改时间
     */
    @TableField(value = "last_modification_time", fill = FieldFill.INSERT_UPDATE)
    private Date lastModificationTime;
    /**
     * 创建用户
     */
    private Long creatorUserId;
    /**
     * 修改用户
     */
    @TableField(value = "last_modifier_user_id", fill = FieldFill.UPDATE)
    private Long lastModifierUserId;
    /**
     * 删除用户
     */
    private Long deleterUserId;
    /**
     * 删除时间
     */
    private Date deletionTime;

    /**
     * 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 创建时间
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * 创建时间
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 修改时间
     */
    public Date getLastModificationTime() {
        return lastModificationTime;
    }

    /**
     * 修改时间
     */
    public void setLastModificationTime(Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * 创建用户
     */
    public Long getCreatorUserId() {
        return creatorUserId;
    }

    /**
     * 创建用户
     */
    public void setCreatorUserId(Long creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    /**
     * 修改用户
     */
    public Long getLastModifierUserId() {
        return lastModifierUserId;
    }

    /**
     * 修改用户
     */
    public void setLastModifierUserId(Long lastModifierUserId) {
        this.lastModifierUserId = lastModifierUserId;
    }

    /**
     * 删除用户
     */
    public Long getDeleterUserId() {
        return deleterUserId;
    }

    /**
     * 删除用户
     */
    public void setDeleterUserId(Long deleterUserId) {
        this.deleterUserId = deleterUserId;
    }

    /**
     * 删除时间
     */
    public Date getDeletionTime() {
        return deletionTime;
    }

    /**
     * 删除时间
     */
    public void setDeletionTime(Date deletionTime) {
        this.deletionTime = deletionTime;
    }
//    /**
//     * 是否删除(逻辑删除)
//     */
//    @TableLogic
//    private Integer isRemove = 0;
//    /**
//     * 是否删除
//     */
//    public Integer getIsRemove() {
//        return isRemove;
//    }
//
//    /**
//     * 是否删除
//     */
//    public void setIsRemove(Integer isRemove) {
//        this.isRemove = isRemove;
//    }
}
