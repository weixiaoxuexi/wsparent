package com.weixiao.wxpersistent.dao;

import com.weixiao.wxpersistent.domain.UserObject;
import com.weixiao.wxpersistent.domain.UserObjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserObjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_users
     *
     * @mbg.generated Sat Aug 25 21:21:50 CST 2018
     */
    long countByExample(UserObjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_users
     *
     * @mbg.generated Sat Aug 25 21:21:50 CST 2018
     */
    int deleteByExample(UserObjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_users
     *
     * @mbg.generated Sat Aug 25 21:21:50 CST 2018
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_users
     *
     * @mbg.generated Sat Aug 25 21:21:50 CST 2018
     */
    int insert(UserObject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_users
     *
     * @mbg.generated Sat Aug 25 21:21:50 CST 2018
     */
    int insertSelective(UserObject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_users
     *
     * @mbg.generated Sat Aug 25 21:21:50 CST 2018
     */
    List<UserObject> selectByExample(UserObjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_users
     *
     * @mbg.generated Sat Aug 25 21:21:50 CST 2018
     */
    UserObject selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_users
     *
     * @mbg.generated Sat Aug 25 21:21:50 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserObject record, @Param("example") UserObjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_users
     *
     * @mbg.generated Sat Aug 25 21:21:50 CST 2018
     */
    int updateByExample(@Param("record") UserObject record, @Param("example") UserObjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_users
     *
     * @mbg.generated Sat Aug 25 21:21:50 CST 2018
     */
    int updateByPrimaryKeySelective(UserObject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_users
     *
     * @mbg.generated Sat Aug 25 21:21:50 CST 2018
     */
    int updateByPrimaryKey(UserObject record);
}