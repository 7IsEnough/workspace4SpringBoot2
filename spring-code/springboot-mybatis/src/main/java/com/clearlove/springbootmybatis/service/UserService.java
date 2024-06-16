package com.clearlove.springbootmybatis.service;

import com.clearlove.springbootmybatis.pojo.User;

/**
 * @author promise
 * @date 2024/6/16 - 17:14
 */
public interface UserService {

  public User findById(Integer id);

}
