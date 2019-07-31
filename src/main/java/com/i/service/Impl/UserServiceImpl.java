package com.i.service.Impl;

import com.i.dao.UserDao;
import com.i.entity.UserInfo;
import com.i.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public UserInfo login(UserInfo user) {
        return userDao.login(user);
    }
}
