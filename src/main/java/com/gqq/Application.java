package com.gqq;

import com.gqq.boot.dao.PhoneMapper;
import com.gqq.boot.pojo.Phone;
import com.gqq.test.dao.TestMapper;
import com.gqq.test.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guo on 2017/6/29.
 */
@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Application {

    @Autowired
    private PhoneMapper phoneMapper;
    @Autowired
    private TestMapper testMapper;

    @RequestMapping("/")
    public String greeting() {

        Phone phone=new Phone();
        phone.setPhone("13566265656");
        phoneMapper.insert(phone);

        System.out.println("phone insert");

        Test test=new Test();
        test.setName("hello world");
        testMapper.insert(test);

        System.out.println("test insert");



        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
