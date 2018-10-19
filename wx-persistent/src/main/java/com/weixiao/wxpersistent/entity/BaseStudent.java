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
@TableName("base_student")
public class BaseStudent extends Model<BaseStudent> {

    private static final long serialVersionUID = 1L;

    /**
     * student id主键
     */
    @TableId(value = "base_student_id", type = IdType.AUTO)
    private Long baseStudentId;
    /**
     * 学校信息
     */
    private String school;
    /**
     * 年级，1-12，分别代表从1年级到9年级，高1到高3
     */
    private Integer level;
    /**
     * 姓名
     */
    private String name;
    private String sex;
    @TableField("created_by")
    private Long createdBy;
    @TableField("created_time")
    private Date createdTime;
    @TableField("update_by")
    private Long updateBy;
    @TableField("update_time")
    private Date updateTime;
    @TableField("base_user_id")
    private Long baseUserId;


    public Long getBaseStudentId() {
        return baseStudentId;
    }

    public void setBaseStudentId(Long baseStudentId) {
        this.baseStudentId = baseStudentId;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getBaseUserId() {
        return baseUserId;
    }

    public void setBaseUserId(Long baseUserId) {
        this.baseUserId = baseUserId;
    }

    @Override
    protected Serializable pkVal() {
        return this.baseStudentId;
    }

    @Override
    public String toString() {
        return "BaseStudent{" +
        ", baseStudentId=" + baseStudentId +
        ", school=" + school +
        ", level=" + level +
        ", name=" + name +
        ", sex=" + sex +
        ", createdBy=" + createdBy +
        ", createdTime=" + createdTime +
        ", updateBy=" + updateBy +
        ", updateTime=" + updateTime +
        ", baseUserId=" + baseUserId +
        "}";
    }
}
