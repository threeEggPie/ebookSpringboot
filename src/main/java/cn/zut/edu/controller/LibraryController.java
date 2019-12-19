package cn.zut.edu.controller;

import cn.zut.edu.pojo.Book;
import cn.zut.edu.pojo.Search;
import cn.zut.edu.result.Result;
import cn.zut.edu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController

public class LibraryController {
    Result result=new Result();
    @Autowired
    BookService bookService;
    List<Book> books;
    @GetMapping("api/kind/{cid}")
    public Result list(@PathVariable("cid") int cid){
        if (cid==0){
            books=bookService.findAll();
        }else {
            books=bookService.findByCategory(cid);
        }
        result.setCode(200);
//        System.out.println(books.toArray());
        result.setData(books);
        return result;
    }
    @GetMapping("/api/search")
    public Result search( String keyWords){
        System.out.println(keyWords);
        if ("".equals(keyWords)||keyWords==null){
            books=bookService.findAll();
        }else {
            books=bookService.findByTitleOrAuthor(keyWords);
        }
        result.setCode(200);
        result.setData(books);
        return result;
    }

}
