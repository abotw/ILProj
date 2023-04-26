package com.ilproj.backend.sys.controller;

import com.ilproj.backend.common.vo.Result;
import com.ilproj.backend.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author IL
 * @since 2023-04-26
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService iUserService;
    @GetMapping("/{id}")
    public Result<?> getUser(@PathVariable("id") Long id) {
        HashMap<String, Object> data = new HashMap<String, Object>();
        data.put("user", iUserService.byid(id));

        return Result.success(data);
    }


}
