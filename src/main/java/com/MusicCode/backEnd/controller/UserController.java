package com.MusicCode.backEnd.controller;

import com.MusicCode.backEnd.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private IUserService userService;
}
