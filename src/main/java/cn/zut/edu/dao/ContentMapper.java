package cn.zut.edu.dao;

import cn.zut.edu.pojo.Content;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContentMapper {

    Content findContent(int id);

}
