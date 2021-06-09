package com.MusicCode.backEnd;

import com.MusicCode.backEnd.dao.IUserDao;
import com.MusicCode.backEnd.model.User;
import com.MusicCode.backEnd.service.IUserService;
import com.MusicCode.backEnd.service.impl.impUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BackEndApplicationTests {

    @Autowired
    private impUserService userService;

    @Test
    void contextLoads() {

    }

}
