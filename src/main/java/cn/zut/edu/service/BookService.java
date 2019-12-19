package cn.zut.edu.service;

import cn.zut.edu.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {

    List<Book> findByCategory(int id);

    List<Book> findAll();

    List<Book> findByTitleOrAuthor( String keyWords);
}
