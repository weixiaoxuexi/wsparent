package com.weixiao.wxpersistent.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lixu
 * @since 2018-10-18
 */
@TableName("base_user")
public class BaseUser extends Model<BaseUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 基础用户信息主键
     */
    @TableId(value = "base_user_id", type = IdType.AUTO)
    private Long baseUserId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码，spring boot Security中自动加密
     */
    private String password;
    /**
     * 微信id
     */
    @TableField("wx_id")
    private String wxId;
    /**
     * 微信名称
     */
    @TableField("wx_name")
    private String wxName;
    /**
     * 微信头像url
     */
    @TableField("wx_icon")
    private String wxIcon;
    /**
     * 创建时间
     */
    @TableField("created_time")
    private Date createdTime;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;


    public Long getBaseUserId() {
        return baseUserId;
    }

    public void setBaseUserId(Long baseUserId) {
        this.baseUserId = baseUserId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getWxName() {
        return wxName;
    }

    public void setWxName(String wxName) {
        this.wxName = wxName;
    }

    public String getWxIcon() {
        return wxIcon;
    }

    public void setWxIcon(String wxIcon) {
        this.wxIcon = wxIcon;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.baseUserId;
    }

    @Override
    public String toString() {
        return "BaseUser{" +
        ", baseUserId=" + baseUserId +
        ", username=" + username +
        ", password=" + password +
        ", wxId=" + wxId +
        ", wxName=" + wxName +
        ", wxIcon=" + wxIcon +
        ", createdTime=" + createdTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
