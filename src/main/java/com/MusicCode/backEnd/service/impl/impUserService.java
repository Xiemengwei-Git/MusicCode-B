package com.MusicCode.backEnd.service.impl;

import com.MusicCode.backEnd.dao.IUserDao;
import com.MusicCode.backEnd.model.User;
import com.MusicCode.backEnd.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class impUserService extends ServiceImpl<IUserDao,User> implements IUserService {

    @Autowired
    private IUserDao userDao;

}
