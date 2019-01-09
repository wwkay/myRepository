package com.wwk.dao;

import com.wwk.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserDao {
    @Select("select * from t_user")
    List<User> findAll();

    @Select("select * from t_user where id=#{id}")
    List<User> findById(@Param("id") Integer id);

    @Select("select * from t_user where name=#{name}")
    List<User> findByName(@Param("name") String name);

    @Insert("insert into t_user(id,name,age)values(#{id},#{name},#{age})")
    void addUser(@Param("id") Integer id,
                 @Param("name") String name,
                 @Param("age") Integer age);

    @Delete("delete from t_user where id=#{id}")
    void deleteUser(@Param("id") Integer id);

    @Update("update t_user set name=#{name},age=#{age} where id=#{id}")
    void updateUser(@Param("id") Integer id,
                    @Param("name") String name,
                    @Param("age") Integer age);

}
