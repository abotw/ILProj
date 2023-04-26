package com.ilproj.backend.sys.service;

import com.ilproj.backend.sys.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author IL
 * @since 2023-04-26
 */

public interface IUserService extends IService<User> {

    User byid(long id);

}
