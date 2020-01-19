package com.smallrain.smallmall.msg.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smallrain.smallmall.msg.user.entity.User;


/**
 * <p>
 * 会员表 Mapper 接口
 * </p>
 *
 * @author wangying
 * @since 2020-01-10
 */
 @Mapper
public interface UserMapper extends BaseMapper<User> {

}