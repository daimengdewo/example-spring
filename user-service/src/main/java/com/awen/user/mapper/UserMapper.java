package com.awen.user.mapper;

import com.awen.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from tb_user where id = #{id}")
    User findById(@Param("id") Long id);
}