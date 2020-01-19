package com.smallrain.smallmall.msg.user.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.smallrain.smallmall.exception.SmallrMallException;
import com.smallrain.smallmall.model.QueryParam;
import com.smallrain.smallmall.model.Response;
import lombok.extern.slf4j.Slf4j;
import com.smallrain.smallmall.msg.user.service.UserService;
import com.smallrain.smallmall.utils.ExceptionCodeUtil;
import com.smallrain.smallmall.msg.user.entity.User;


/**
 *
 * @author wangying
 * @since 2020-01-14
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/list")
    public Response list(@RequestBody String query) throws SmallrMallException {
      log.info("获取   User 列表, 参数:{}",query);
      if(StringUtils.isBlank(query)) {
        throw new SmallrMallException(ExceptionCodeUtil.EXCEPTION_CODE_PARAM_ERROR,"查询参数为空");
      }
      QueryParam<User> param = new QueryParam<>(query,User.class);
      return Response.success(userService.getList(param));
    }
    
    @PostMapping("")
    public Response add(@RequestBody User entity) throws SmallrMallException  {
      log.info("添加一条 User 记录");
      return Response.success(userService.add(entity));
    }
    
    @PutMapping("")
    public Response put(@RequestBody User entity) throws SmallrMallException  {
      log.info("更新一条 User 记录");
      return Response.success(userService.update(entity));
    }
    
    @GetMapping("/{id}")
    public Response get(@PathVariable String id) throws SmallrMallException  {
      log.info("根据 ID：{} 获取一条 User 记录",id);
      return Response.success(userService.getById(id));
    }
    
    @DeleteMapping("/{id}")
    public Response delete(@PathVariable String id) throws SmallrMallException  {
      log.info("根据 ID：{} 删除一条 User 记录",id);
      return Response.success(userService.delete(id));
    }
}
