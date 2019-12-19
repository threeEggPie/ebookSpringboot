package cn.zut.edu.controller;

import cn.zut.edu.pojo.User;
import cn.zut.edu.result.Result;
import cn.zut.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;


@RestController
public class LoginController {
    @Autowired
    UserService userService;
    @CrossOrigin
    @PostMapping("/api/login")
    public Result login(@RequestBody User requestUser, HttpSession session){
        Result result = new Result();
        String username = requestUser.getUsername();
         username = HtmlUtils.htmlEscape(username);
        System.out.println(username+"  "+requestUser.getPassword());
        User user = userService.login(username, requestUser.getPassword());
        if (null!=user){
            result.setCode(200);
            result.setData(user);
            session.setAttribute("user",user);
            return result;
        }
        result.setCode(400);
        result.setData("输入密码有误");
        return result;
    }
}
