package com.ilproj.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;


/**
 * <p>
 * 
 * </p>
 *
 * @author IL
 * @since 2023-04-27
 */
//@ApiModel(value = "User对象", description = "")
    @TableName(value = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private String password;

    private String email;

    private Integer deleted;

    private Integer nickname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getNickname() {
        return nickname;
    }

    public void setNickname(Integer nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "User{" +
            "id = " + id +
            ", username = " + username +
            ", password = " + password +
            ", email = " + email +
            ", deleted = " + deleted +
            ", nickname = " + nickname +
        "}";
    }
}
