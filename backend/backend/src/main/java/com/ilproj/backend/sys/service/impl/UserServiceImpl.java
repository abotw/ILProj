package com.ilproj.backend.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ilproj.backend.sys.mapper.UserMapper;
import com.ilproj.backend.sys.service.IUserService;
import com.ilproj.backend.sys.entity.User;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ilproj.backend.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

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

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User byid(long id) {
        User byId = this.baseMapper.selectById(id);

        return byId;
    }

    /**
     * 登录
     * @return
     */
    @Override
    public Map<String,Object> userLogin(User user) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(StringUtils.hasLength(user.getUsername()),User::getUsername,user.getUsername());
        User loginUser = this.baseMapper.selectOne(wrapper);
        if (loginUser != null && passwordEncoder.matches(user.getPassword(),loginUser.getPassword())){
            String token = JwtUtils.jwtEncode(user);
            HashMap<String, Object> data = new HashMap<>();
            data.put("token",token);
            return data;
        }
        return null;
    }
}
