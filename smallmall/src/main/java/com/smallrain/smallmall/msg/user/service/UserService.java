package com.smallrain.smallmall.msg.user.service;

import com.smallrain.smallmall.msg.user.entity.User;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.smallrain.smallmall.exception.SmallrMallException;
import com.smallrain.smallmall.model.QueryParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 *
 * @author wangying
 * @since 2020-01-14
 */
public interface UserService extends IService<User> {
  
  public IPage<User> getList(QueryParam<User> param) throws SmallrMallException;
  
  public User add(User entity) throws SmallrMallException;
  
  public User update(User entity) throws SmallrMallException;
  
  public boolean delete(String... ids) throws SmallrMallException;
}
