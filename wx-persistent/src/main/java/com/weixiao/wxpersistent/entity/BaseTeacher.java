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
@TableName("base_teacher")
public class BaseTeacher extends Model<BaseTeacher> {

    private static final long serialVersionUID = 1L;

    /**
     * teacher主键
     */
    @TableId(value = "base_teacher_id", type = IdType.AUTO)
    private Long baseTeacherId;
    /**
     * 教师姓名
     */
    @TableField("teacher_name")
    private String teacherName;
    /**
     * 教师性别
     */
    private String sex;
    /**
     * 账号是否有效，flag为N表示暂时无效
     */
    private String flag;
    @TableField("primary_school")
    private String primarySchool;
    @TableField("junior_school")
    private String juniorSchool;
    @TableField("senior_school")
    private String seniorSchool;
    private Date birthday;
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
    private String subject;


    public Long getBaseTeacherId() {
        return baseTeacherId;
    }

    public void setBaseTeacherId(Long baseTeacherId) {
        this.baseTeacherId = baseTeacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getPrimarySchool() {
        return primarySchool;
    }

    public void setPrimarySchool(String primarySchool) {
        this.primarySchool = primarySchool;
    }

    public String getJuniorSchool() {
        return juniorSchool;
    }

    public void setJuniorSchool(String juniorSchool) {
        this.juniorSchool = juniorSchool;
    }

    public String getSeniorSchool() {
        return seniorSchool;
    }

    public void setSeniorSchool(String seniorSchool) {
        this.seniorSchool = seniorSchool;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    protected Serializable pkVal() {
        return this.baseTeacherId;
    }

    @Override
    public String toString() {
        return "BaseTeacher{" +
        ", baseTeacherId=" + baseTeacherId +
        ", teacherName=" + teacherName +
        ", sex=" + sex +
        ", flag=" + flag +
        ", primarySchool=" + primarySchool +
        ", juniorSchool=" + juniorSchool +
        ", seniorSchool=" + seniorSchool +
        ", birthday=" + birthday +
        ", createdBy=" + createdBy +
        ", createdTime=" + createdTime +
        ", updateBy=" + updateBy +
        ", updateTime=" + updateTime +
        ", baseUserId=" + baseUserId +
        ", subject=" + subject +
        "}";
    }
}
