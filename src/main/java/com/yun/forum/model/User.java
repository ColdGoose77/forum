package com.yun.forum.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;


@Data
public class User {
    private Long id;

    private String username;

    // 该注解表示指定的属性不参与序列化
    @JsonIgnore
    private String password;

    private String nickname;

    private String phoneNum;

    private String email;

    private Byte gender;

    @JsonIgnore
    private String salt;

    @JsonInclude(JsonInclude.Include.ALWAYS)
    private String avatarUrl;

    private Integer articleCount;

    private Byte isAdmin;

    private String remark;

    private Byte state;

    @JsonIgnore
    private Byte deleteState;

    private Date createTime;

    private Date updateTime;

}