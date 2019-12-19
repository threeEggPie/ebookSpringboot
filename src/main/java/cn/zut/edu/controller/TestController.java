package cn.zut.edu.controller;

import cn.zut.edu.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {
    @GetMapping("/test")
    public void test(HttpServletRequest request){
        String contextPath = request.getSession().getServletContext().getContextPath();
        String contextPath1 = request.getContextPath();
        System.out.println(contextPath+"____");
        System.out.println(contextPath1+"+++++++++++");
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
    }
}
