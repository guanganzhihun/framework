package com.dao.impl;

import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate template;


}
