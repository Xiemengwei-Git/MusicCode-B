package com.MusicCode.backEnd.controller;

import com.MusicCode.backEnd.model.User;
import com.MusicCode.backEnd.service.IUserService;
import com.MusicCode.backEnd.service.impl.impUserService;
import com.MusicCode.backEnd.untils.R;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private impUserService userService;


    @GetMapping("/toLogin")
    public String toLogin(){
        return "login";
    }


    @PostMapping("/login/{username}/{password}")
    public R login(User user){
        R r = new R();
       try {
           if(userService.login(user).equals("1")) {
               r.setCode(1);
               r.setData("登录成功");
           }else if(userService.login(user).equals("0")){
               r.setCode(0);
               r.setData("该用户不存在");
           }else if(userService.login(user).equals("-1")){
               r.setCode(-1);
               r.setData("登陆失败，密码错误");
           }
       }catch (Exception e){
           r.setCode(-2);
           r.setData("登陆异常");
       }
       return r;
    }

}
