package com.weixiao.wxpersistent.serviceImpl;

import com.weixiao.wxpersistent.entity.BaseStudent;
import com.weixiao.wxpersistent.mapper.BaseStudentMapper;
import com.weixiao.wxpersistent.service.BaseStudentService;
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
public class BaseStudentImplService extends ServiceImpl<BaseStudentMapper, BaseStudent> implements BaseStudentService {

}
