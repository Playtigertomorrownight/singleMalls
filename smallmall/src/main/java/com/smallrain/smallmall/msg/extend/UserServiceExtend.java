package com.smallrain.smallmall.msg.extend;

import com.smallrain.smallmall.msg.user.entity.User;
import com.smallrain.smallmall.msg.user.service.UserService;

/**
 * 用户操作服务层 扩展
 * @author wangying
 * @since 2020-01-14
 */
public interface UserServiceExtend extends UserService {
  
  public User getUserByUserName(String username);
  
}
