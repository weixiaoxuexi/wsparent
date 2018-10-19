package com.weixiao.wxpersistent.entity;

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
@TableName("user_student")
public class UserStudent extends Model<UserStudent> {

    private static final long serialVersionUID = 1L;

    private Long id;
    @TableField("base_user_base_user_id")
    private Long baseUserBaseUserId;
    @TableField("base_student_base_student_id")
    private Long baseStudentBaseStudentId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBaseUserBaseUserId() {
        return baseUserBaseUserId;
    }

    public void setBaseUserBaseUserId(Long baseUserBaseUserId) {
        this.baseUserBaseUserId = baseUserBaseUserId;
    }

    public Long getBaseStudentBaseStudentId() {
        return baseStudentBaseStudentId;
    }

    public void setBaseStudentBaseStudentId(Long baseStudentBaseStudentId) {
        this.baseStudentBaseStudentId = baseStudentBaseStudentId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserStudent{" +
        ", id=" + id +
        ", baseUserBaseUserId=" + baseUserBaseUserId +
        ", baseStudentBaseStudentId=" + baseStudentBaseStudentId +
        "}";
    }
}
