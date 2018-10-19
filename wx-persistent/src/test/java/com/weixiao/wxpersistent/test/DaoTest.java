//package com.weixiao.wxpersistent.test;
//
//import com.weixiao.wxpersistent.WxPersistentApplication;
//import com.weixiao.wxpersistent.dao.UserObjectMapper;
//import com.weixiao.wxpersistent.domain.UserObject;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.*;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = WxPersistentApplication.class)
//public class DaoTest {
//
//    @Autowired
//    private UserObjectMapper userObjectMapper;
//
//
//    @Test
//    public void insertUser() {
//        UserObject userObject = new UserObject();
//        userObject.setUserId(UUID.randomUUID().toString());
//        userObject.setUserName("lixu");
//        userObject.setMobile("15208210871");
//        userObject.setPassword("password");
//        userObject.setStatus(1);
//        userObject.setCreateTime(new Date());
//        int result = userObjectMapper.insert(userObject);
//        System.out.println(result);
//        Assert.assertEquals(result, 1);
//    }
//
//    @Test
//    public void insertThousandUser() {
//        UserObject userObject = new UserObject();
//        int i = 0;
//        int res = 0;
//        while (i < 1000) {
//            userObject.setUserId(UUID.randomUUID().toString());
//            userObject.setUserName("lixu" + i);
//            userObject.setMobile(String.valueOf(Long.parseLong("15208210871") + i));
//            userObject.setPassword("password");
//            userObject.setStatus(1);
//            userObject.setCreateTime(new Date());
//            res = res + userObjectMapper.insert(userObject);
//            i = i + 1;
//            if (i % 10 == 0) {
//                System.out.println(i);
//            }
//        }
//        Assert.assertEquals(res, 1000);
//    }
//
//    /**
//     * 进行分页查询
//     */
//    @Test
//    public void selectByPageSize() {
//        try {
//            Map<String, Object> map = new HashMap<String, Object>();
//            map.put("start", 300);
//            map.put("pageSize", 20);
//            List<UserObject> list = userObjectMapper.selectByPageSize(map);
//            Assert.assertEquals(list.size(), 20);
//            System.out.println(list.get(0).getUserName());
//            Assert.assertEquals(list.get(1).getUserName(), "lixu772");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//    }
//}
