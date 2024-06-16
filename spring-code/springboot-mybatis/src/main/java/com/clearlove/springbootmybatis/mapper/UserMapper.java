package com.clearlove.springbootmybatis.mapper;

import com.clearlove.springbootmybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author promise
 * @date 2024/6/16 - 17:13
 */
@Mapper
public interface UserMapper {

  @Select("select * from user where id = #{id}")
  public User findById(Integer id);

}
