package cn.zut.edu.dao;

import cn.zut.edu.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface CategoryMapper {
    List<Category> findAllCategory();
}
