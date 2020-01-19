package com.smallrain.smallmall.msg.user.service.impl;

import java.time.LocalDateTime;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smallrain.smallmall.exception.SmallrMallException;
import com.smallrain.smallmall.model.QueryParam;
import com.smallrain.smallmall.msg.user.entity.User;
import com.smallrain.smallmall.msg.user.mapper.UserMapper;
import com.smallrain.smallmall.msg.user.service.UserService;
import com.smallrain.smallmall.utils.BaseUtils;
import com.smallrain.smallmall.utils.ExceptionCodeUtil;
import com.smallrain.wechat.models.user.entity.SysUser;
import com.smallrain.wechat.utils.EntityCheckUtil;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author wangying
 * @since 2020-01-14
 */
@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

  @Override
  public IPage<User> getList(QueryParam<User> param) {
    log.info("根据参数：{} 查询分页数据",param);
    return this.page(param.getPage(), param.getQueryWrapper());
  }

  @Override
  public User add(User entity) throws SmallrMallException {
    log.info("添加一条记录：{}", entity);
    if (StringUtils.isNotBlank(entity.getId())) {
      update(entity);
    }
    //字段校验程序
     // EntityCheckUtil.userFieldCheck(entity);
    entity.setId(BaseUtils.createUuid("user"));
    entity.setCreateTime(LocalDateTime.now());
    entity.setUpdateTime(LocalDateTime.now());
    entity.setStatus(0);
    if(this.save(entity)) {
      log.info("添加记录成功。");
    }else {
      log.info("添加记录失败。");
      throw new SmallrMallException(ExceptionCodeUtil.EXCEPTION_CODE_DATABASE_ERROR,"数据库添加记录失败");
    }
    return entity;
  }

  @Override
  public User update(User entity) throws SmallrMallException {
    log.info("更新用户：{}", entity);
    if (StringUtils.isBlank(entity.getId()) || !entity.getId().startsWith("user")) {  //id为空，新增用户
      entity.setId(null);
      return add(entity);
    }
    User oldEntity = getById(entity.getId());
    if (null == oldEntity) {
      log.info("不存在 id 为：{} 的用户", entity.getId());
      add(entity);
    }
    BaseUtils.copyNotNullProperties(entity, oldEntity, "id", "create_time");
    //字段校验程序
    // EntityCheckUtil.userFieldCheck(entity);
    log.info("更新用户。。");
    this.updateById(entity);
    return entity;
  }

  @Override
  public boolean delete(String... ids) throws SmallrMallException {
    // TODO Auto-generated method stub
    return false;
  }

}
