package com.example.Test;

import com.example.dao.UserDao;
import com.example.domain.User;
import org.junit.Test;

public class daoTest {
    @Test
    public void  testlogin(){
        User user = new User();
        user.setUSERNAME("jinxinjie");
        user.setPASSWORD("123");
        UserDao dao  = new UserDao();
        dao.login(user);
        System.out.println(user);

    }
}
