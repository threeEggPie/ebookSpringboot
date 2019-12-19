package cn.zut.edu.service;

import cn.zut.edu.dao.BookMapper;
import cn.zut.edu.pojo.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImp implements BookService {
    @Autowired
    BookMapper bookMapper;
    @Override
    public List<Book> findByCategory(int id) {
        System.out.println(bookMapper);
        List<Book> books = bookMapper.findByCategory(id);
        return books;
    }

    @Override
    public List<Book> findAll() {
        List<Book> books = bookMapper.findAll();
        return books;
    }

    @Override
    public List<Book> findByTitleOrAuthor( String keyWords) {
        return bookMapper.findByTitleOrAuthor(keyWords);
    }
}
