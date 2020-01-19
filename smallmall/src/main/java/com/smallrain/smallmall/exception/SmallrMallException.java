package com.smallrain.smallmall.exception;

import org.apache.commons.lang3.StringUtils;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 实体操作专用异常类
 * 
 * @author wangying.dz3
 *
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class SmallrMallException extends Exception {
  
  private static final long serialVersionUID = -5081253413956309237L;
  
  private int code = 0;
  
  private String message = "";

  public SmallrMallException() {
    super();
  }

  public SmallrMallException(int code, String message,Object...param) {
    if(!StringUtils.isBlank(message)) {
      message = String.format(message, param);
    }
    this.message = message;
    this.code = code;
  }

  public SmallrMallException code(int code) {
    this.code = code;
    return this;
  }
  
  public SmallrMallException message(String message,Object...param) {
    if(!StringUtils.isBlank(message)) {
      message = String.format(message, param);
    }
    this.message = message;
    return this;
  }

}
