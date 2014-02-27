package com.gc.core.service.user.impl;

import com.gc.core.dao.BaseDaoI;
import com.gc.core.dao.UserDao;
import com.gc.core.model.user.User;
import com.gc.core.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// Spring Service Bean的标识.
@Service
// 默认将类中的所有函数纳入事务管理.
@Transactional
public class UserSerivceImpl implements UserService {
    private static Logger logger = LoggerFactory.getLogger(UserSerivceImpl.class);

    @Autowired
    private UserDao userDao;
    @Autowired
    private BaseDaoI<User> userDao2;
    @Override
    public List<User> getAllUsers() {
        //TODO test
        userDao.testSql();
        userDao2.find("from User");
        return userDao.getAll();
    }
}
