package com.weixiao.wxpersistent.serviceImpl;

import com.weixiao.wxpersistent.entity.BaseUser;
import com.weixiao.wxpersistent.mapper.BaseUserMapper;
import com.weixiao.wxpersistent.service.BaseUserService;
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
public class BaseUserImplService extends ServiceImpl<BaseUserMapper, BaseUser> implements BaseUserService {

}
