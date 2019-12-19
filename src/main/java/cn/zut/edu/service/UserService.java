package cn.zut.edu.service;

import cn.zut.edu.pojo.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User login(String username,String password);
}
