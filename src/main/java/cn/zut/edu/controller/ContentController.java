package cn.zut.edu.controller;


import cn.zut.edu.pojo.Content;
import cn.zut.edu.result.Result;
import cn.zut.edu.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentController {
    @Autowired
    ContentService contentService;

    Result result=new Result();
    @GetMapping("/api/content/{id}")
    public Result findContent(@PathVariable("id") int id){
        Content content = contentService.findContent(id);
        result.setCode(200);
        result.setData(content);
        return result;
    }
}
