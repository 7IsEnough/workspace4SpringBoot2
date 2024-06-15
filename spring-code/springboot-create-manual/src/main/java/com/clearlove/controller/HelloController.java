package com.clearlove.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author promise
 * @date 2024/6/15 - 22:58
 */
@RestController
public class HelloController {

  @RequestMapping("/hello")
  public String hello() {
    return "hello world~~~";
  }
}
