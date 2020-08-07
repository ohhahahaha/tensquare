package com.tensquare.user.service;

import com.tensquare.user.dao.UserDao;
import com.tensquare.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User findById(String userId) {

        User user = userDao.selectById(userId);
        return user;
    }

    public List<User> findAll(){
        List<User> users = userDao.selectList(null);
        return users;
    }

    public User login(User user) {

        User user1 = userDao.selectOne(user);
        return user1;
    }
}
