package com.gc.core.dao;


import com.gc.core.framework.SimpleHibernateDao;
import com.gc.core.model.user.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends SimpleHibernateDao<User, String> {
    public  void testSql(){
        getSession().createSQLQuery(" select * from ss_ss").list();
    }
}
