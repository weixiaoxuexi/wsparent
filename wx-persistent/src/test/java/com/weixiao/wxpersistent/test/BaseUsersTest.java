package com.weixiao.wxpersistent.test;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.weixiao.wxpersistent.WxPersistentApplication;
import com.weixiao.wxpersistent.entity.BaseUser;
import com.weixiao.wxpersistent.service.BaseUserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = WxPersistentApplication.class)
public class BaseUsersTest {

    @Autowired
    BaseUserService baseUserService;

    @Test
    public void insertUserTest() {
//        BaseUser baseUser = new BaseUser();
//        baseUser.setUsername("lixu");
//        baseUser.setPassword("lixu198511");
//        baseUser.setWxIcon("mypic");
//        baseUser.setWxName("绯色时光");
//        baseUser.setWxId("1234565");
//        baseUserService.insert(baseUser);

        EntityWrapper<BaseUser> ew = new EntityWrapper<BaseUser>();
        ew.eq("username", "lixu");
        List<BaseUser> list = baseUserService.selectList(ew);
        Assert.assertEquals(list.size(), 1);
    }
}
