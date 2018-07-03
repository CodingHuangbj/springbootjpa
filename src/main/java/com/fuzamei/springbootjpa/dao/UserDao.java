package com.fuzamei.springbootjpa.dao;

import com.fuzamei.springbootjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

}
