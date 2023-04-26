package com.ilproj.backend.sys.service.impl;

import com.ilproj.backend.sys.mapper.UserMapper;
import com.ilproj.backend.sys.service.IUserService;
import com.ilproj.backend.sys.entity.User;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author IL
 * @since 2023-04-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
