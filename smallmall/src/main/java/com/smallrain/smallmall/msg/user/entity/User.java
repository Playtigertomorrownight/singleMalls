package com.smallrain.smallmall.msg.user.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author wangying
 * @since 2020-01-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="User对象", description="用户表")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "密码加盐")
    private String salt;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "头像")
    private String icon;

    @ApiModelProperty(value = "手机号码")
    private String phone;

    @ApiModelProperty(value = "性别：0->未知；1->男；2->女")
    private Integer sex;

    @ApiModelProperty(value = "微信openid")
    private String openid;

    @ApiModelProperty(value = "微信登录会话KEY")
    private String sessionKey;

    @ApiModelProperty(value = "生日")
    private LocalDate birthday;

    @ApiModelProperty(value = "个性签名")
    private String signature;

    @ApiModelProperty(value = "用户来源")
    private Integer sourceType;

    @ApiModelProperty(value = "积分")
    private Integer integration;

    @ApiModelProperty(value = "注册时间")
    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @ApiModelProperty(value = "成长值")
    private Integer growth;

    @ApiModelProperty(value = "剩余抽奖次数")
    private Integer luckeyCount;

    @ApiModelProperty(value = "所在城市")
    private String city;

    @ApiModelProperty(value = "职业")
    private String job;

    @ApiModelProperty(value = "帐号启用状态:0->正常；1->删除；")
    private Integer status;

    @ApiModelProperty(value = "会员等级")
    private String memberLevel;

    @ApiModelProperty(value = "最近一次登录时间")
    private LocalDateTime lastLoginTime;

    @ApiModelProperty(value = "最近一次登录IP地址")
    private String lastLoginIp;


}
