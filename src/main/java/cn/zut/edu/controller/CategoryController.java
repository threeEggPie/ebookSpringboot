package cn.zut.edu.controller;

import cn.zut.edu.dao.CategoryMapper;
import cn.zut.edu.pojo.Category;
import cn.zut.edu.result.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    CategoryMapper categoryMapper;
    Result result=new Result();
    @GetMapping("/api/getAllKinds")
    public Result getAllCategory(){
        List<Category> kinds = categoryMapper.findAllCategory();
        System.out.println(kinds);
        result.setCode(200);
        result.setData(kinds);
        return result;
    }

}
