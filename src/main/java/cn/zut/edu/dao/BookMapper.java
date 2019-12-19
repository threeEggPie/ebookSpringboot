package cn.zut.edu.dao;

import cn.zut.edu.pojo.Book;
import cn.zut.edu.pojo.Category;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper
public interface BookMapper {

    List<Book> findByCategory(int id);

    List<Book> findAll();

    List<Book> findByTitleOrAuthor(String keyWords);

}
