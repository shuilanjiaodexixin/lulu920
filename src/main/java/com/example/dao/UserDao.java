package com.example.dao;

import com.example.domain.User;
import com.example.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    public User login(User loginUser) {
        try{
            String sql = "select * from user where USERNAME= ? and  PASSWORD  = ?";
            User  user= template.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUSERNAME(),loginUser.getPASSWORD());
            return user;
        }catch (DataAccessException e){
            e.printStackTrace();
            return null;
        }


    }
}
