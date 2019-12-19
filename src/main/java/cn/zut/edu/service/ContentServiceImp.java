package cn.zut.edu.service;

import cn.zut.edu.dao.ContentMapper;
import cn.zut.edu.pojo.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentServiceImp implements ContentService {
    @Autowired
    ContentMapper contentMapper;

    @Override
    public  Content findContent(int id) {
        Content content = contentMapper.findContent(id);
        return content;
    }
}
