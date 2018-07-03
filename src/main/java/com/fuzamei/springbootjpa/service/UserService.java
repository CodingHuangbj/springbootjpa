package com.fuzamei.springbootjpa.service;

import com.fuzamei.springbootjpa.dao.UserDao;
import com.fuzamei.springbootjpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User addUser(User user){
        User userSave = userDao.save(user);
        return userSave;
    }
}
