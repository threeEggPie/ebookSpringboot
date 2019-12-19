package cn.zut.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.zut.edu.dao")
public class EbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(EbookApplication.class, args);
    }

}
