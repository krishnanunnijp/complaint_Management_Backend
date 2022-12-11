package com.example.complaint_Management_Backend.dao;

import com.example.complaint_Management_Backend.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface userDao extends CrudRepository<User,Integer> {
    @Query(value = "SELECT `id`, `address`, `email`, `name`, `password`, `phoneno` FROM `user` WHERE `email`=:email AND `password`=:password",nativeQuery = true)
    List<User> passwordUsers(@Param("email") String email,@Param("password") String password);

    @Query(value = "SELECT `id`, `address`, `email`, `name`, `password`, `phoneno` FROM `user` WHERE `id` =:id",nativeQuery = true)
    List<User> profileUsers(@Param("id") Integer id);
}
