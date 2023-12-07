package com.chenggou.ssm.homework.dao;

import com.chenggou.ssm.homework.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("select * from users where UserName = #{UserName}, Password = #{Password}")
    public Users login(@Param("UserName") String username, @Param("Password") String password);
}
