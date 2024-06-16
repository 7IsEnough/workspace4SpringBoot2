package com.clearlove.springbootmybatis.controller;

import com.clearlove.springbootmybatis.pojo.User;
import com.clearlove.springbootmybatis.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author promise
 * @date 2024/6/16 - 17:17
 */
@RestController
@AllArgsConstructor
public class UserController {

  private final UserService userService;


  @RequestMapping("/findById")
  public User findById(Integer id) {
    return userService.findById(id);
  }

}
