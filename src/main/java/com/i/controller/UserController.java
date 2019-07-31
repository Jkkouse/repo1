package com.i.controller;

import com.i.entity.UserInfo;
import com.i.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(UserInfo userInfo,HttpSession session){
        if(userService.login(userInfo) != null){
            session.setAttribute("userInfo",userService.login(userInfo));
            return "登录成功";
        }else{
            return "登录失败";
        }
    }

    @RequestMapping("/toback")
    public String toback(HttpSession session){
        return "rear/backIndex";
    }

}
