package com.MusicCode.backEnd.service.impl;

import com.MusicCode.backEnd.dao.IUserDao;
import com.MusicCode.backEnd.model.User;
import com.MusicCode.backEnd.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class impUserService extends ServiceImpl<IUserDao,User> implements IUserService {

    public String login(User user){
        String flag="1";
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.select("username","password").like("username",user.getUsername());
        List<User> userList =this.list(userQueryWrapper);
        if (userList.size()<1){
            flag="0";
        }else if(!userList.get(0).getPassword().equals(user.getPassword())){

            flag="-1";
        }
        return flag;
    }


}
