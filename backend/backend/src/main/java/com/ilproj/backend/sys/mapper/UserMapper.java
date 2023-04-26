package com.ilproj.backend.sys.mapper;

import com.ilproj.backend.sys.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author IL
 * @since 2023-04-26
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
