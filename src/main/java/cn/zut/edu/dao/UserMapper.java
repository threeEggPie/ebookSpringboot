package cn.zut.edu.dao;

import cn.zut.edu.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User login(String username,String password);

}
