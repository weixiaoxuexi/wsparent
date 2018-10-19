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
@TableName("base_achievement")
public class BaseAchievement extends Model<BaseAchievement> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "base_achievement_id", type = IdType.AUTO)
    private Long baseAchievementId;
    private String subject;
    @TableField("test_score")
    private Integer testScore;
    @TableField("test_date")
    private Date testDate;
    private String type;
    @TableField("base_student_base_student_id")
    private Long baseStudentBaseStudentId;


    public Long getBaseAchievementId() {
        return baseAchievementId;
    }

    public void setBaseAchievementId(Long baseAchievementId) {
        this.baseAchievementId = baseAchievementId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getTestScore() {
        return testScore;
    }

    public void setTestScore(Integer testScore) {
        this.testScore = testScore;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getBaseStudentBaseStudentId() {
        return baseStudentBaseStudentId;
    }

    public void setBaseStudentBaseStudentId(Long baseStudentBaseStudentId) {
        this.baseStudentBaseStudentId = baseStudentBaseStudentId;
    }

    @Override
    protected Serializable pkVal() {
        return this.baseAchievementId;
    }

    @Override
    public String toString() {
        return "BaseAchievement{" +
        ", baseAchievementId=" + baseAchievementId +
        ", subject=" + subject +
        ", testScore=" + testScore +
        ", testDate=" + testDate +
        ", type=" + type +
        ", baseStudentBaseStudentId=" + baseStudentBaseStudentId +
        "}";
    }
}
