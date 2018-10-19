package com.weixiao.wxpersistent.entity;

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
@TableName("base_infodata")
public class BaseInfodata extends Model<BaseInfodata> {

    private static final long serialVersionUID = 1L;

    /**
     * 基础信息表主键
     */
    @TableId("base_infodata_id")
    private Long baseInfodataId;
    /**
     * 类型，比如：年级
     */
    private String type;
    /**
     * 类型下的代替码，比如年级下的1，表示一年级
     */
    private String data;
    /**
     * 真实的表述值，一年级
     */
    private String value;
    /**
     * 创建时间，自动赋值
     */
    @TableField("created_date")
    private Date createdDate;
    /**
     * 最新更新时间
     */
    @TableField("update_date")
    private Date updateDate;
    /**
     * 基础信息描述
     */
    private String description;


    public Long getBaseInfodataId() {
        return baseInfodataId;
    }

    public void setBaseInfodataId(Long baseInfodataId) {
        this.baseInfodataId = baseInfodataId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    protected Serializable pkVal() {
        return this.baseInfodataId;
    }

    @Override
    public String toString() {
        return "BaseInfodata{" +
        ", baseInfodataId=" + baseInfodataId +
        ", type=" + type +
        ", data=" + data +
        ", value=" + value +
        ", createdDate=" + createdDate +
        ", updateDate=" + updateDate +
        ", description=" + description +
        "}";
    }
}
