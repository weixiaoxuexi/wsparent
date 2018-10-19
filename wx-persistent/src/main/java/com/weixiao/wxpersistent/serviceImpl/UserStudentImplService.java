package com.weixiao.wxpersistent.serviceImpl;

import com.weixiao.wxpersistent.entity.UserStudent;
import com.weixiao.wxpersistent.mapper.UserStudentMapper;
import com.weixiao.wxpersistent.service.UserStudentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lixu
 * @since 2018-10-18
 */
@Service
public class UserStudentImplService extends ServiceImpl<UserStudentMapper, UserStudent> implements UserStudentService {

}
