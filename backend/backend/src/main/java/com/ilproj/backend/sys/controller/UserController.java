package com.ilproj.backend.sys.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ilproj.backend.common.vo.Result;
import com.ilproj.backend.sys.entity.User;
import com.ilproj.backend.sys.service.IUserService;
import com.ilproj.backend.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author IL
 * @since 2023-04-26
 */
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/list")
    public Result<?> test() {
        HashMap<String, Object> data = new HashMap<>();
        data.put("data", iUserService.list());
        return Result.success(data);
    }

    @GetMapping("/{id}")
    public Result<?> getUser(@PathVariable("id") Long id) {
        HashMap<String, Object> data = new HashMap<String, Object>();
        data.put("user", iUserService.byid(id));

        return Result.success(data);
    }

    /**
     * 验证用户账号密码获取token
     * @param user
     * @return
     */
    @PostMapping("/token")
    public Result<?> userLogin(@RequestBody User user) {
        Map<String, Object> data = iUserService.userLogin(user);
        if (data != null) {
            return Result.success(data);
        }
        return Result.fail("密码或账号不正确");
    }

    /**
     *根据用户传入的参数进行注册
     * @param username
     * @param password
     * @param password_confirm
     * @param eamil
     * @param nickname
     * @return
     */
    @PostMapping("/register")
    public Result<?> userRegister(@RequestParam("username") String username,
                                  @RequestParam("password") String password,
                                  @RequestParam("password_confirm") String password_confirm,
                                  @RequestParam("email") String eamil,
                                  @RequestParam(value = "nickname", required = false) String nickname) {
        if (!(StringUtils.hasLength(username) && StringUtils.hasLength(password))) {
            return Result.fail("用户名和密码不能为空");
        }
        if (!password.equals(password_confirm)) {
            return Result.fail("两次输入的密码不一致");
        }
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(StringUtils.hasLength(username), User::getUsername, username);
        User registerUSer = iUserService.getOne(wrapper);
        if (registerUSer == null) {
            User user = new User();
            user.setUsername(username);
            user.setPassword(passwordEncoder.encode(password));
            user.setEmail(eamil);
            user.setNickname(nickname);
            try {
                iUserService.save(user);
                return Result.success("注册成功");
            } catch (Exception e) {
                throw new RuntimeException("注册失败，数据注入时发生错误");
            }
        }
            return Result.fail("用户名已存在");
    }

}
