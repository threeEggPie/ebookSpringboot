package cn.zut.edu.service;

import cn.zut.edu.dao.UserMapper;
import cn.zut.edu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User login(String username, String password) {
        User user = userMapper.login(username, password);
        return user;
    }
}
