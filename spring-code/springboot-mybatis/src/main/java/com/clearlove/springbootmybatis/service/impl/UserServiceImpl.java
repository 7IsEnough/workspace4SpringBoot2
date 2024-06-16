package com.clearlove.springbootmybatis.service.impl;

import com.clearlove.springbootmybatis.mapper.UserMapper;
import com.clearlove.springbootmybatis.pojo.User;
import com.clearlove.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author promise
 * @date 2024/6/16 - 17:15
 */

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;

  @Override
  public User findById(Integer id) {
    return userMapper.findById(id);
  }
}
