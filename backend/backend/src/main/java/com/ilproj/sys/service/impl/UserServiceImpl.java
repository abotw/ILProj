package com.ilproj.sys.service.impl;

import com.ilproj.sys.entity.User;
import com.ilproj.sys.mapper.UserMapper;
import com.ilproj.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author IL
 * @since 2023-04-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
