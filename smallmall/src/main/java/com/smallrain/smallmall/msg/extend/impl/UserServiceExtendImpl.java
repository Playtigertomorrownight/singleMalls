package com.smallrain.smallmall.msg.extend.impl;

import org.springframework.stereotype.Service;

import com.smallrain.smallmall.msg.extend.UserServiceExtend;
import com.smallrain.smallmall.msg.user.entity.User;
import com.smallrain.smallmall.msg.user.service.impl.UserServiceImpl;

/**
 * 用户服务层扩展实现
 * @author wangying.dz3
 *
 */
@Service
public class UserServiceExtendImpl extends UserServiceImpl  implements UserServiceExtend {

  @Override
  public User getUserByUserName(String username) {
    // TODO Auto-generated method stub
    return null;
  }

  
  
}
