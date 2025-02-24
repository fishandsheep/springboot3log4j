package com.zdx.springboot3log4j;

import com.zdx.springboot3log4j.bean.Persion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class Springboot3log4jApplication {


    public static void main(String[] args) {
        SpringApplication.run(Springboot3log4jApplication.class, args);
    }


    @GetMapping("/log4j")
    public String log4j() {
        Persion persion = new Persion();
        persion.setId(1);
        persion.setName("zdx");
        persion.setBirthday("1989-01-01");
        persion.setAge(19);

        for (int i = 0; i < 10; i++) {
            log.info("The persion is {}", persion);
        }

        return "hello";
    }

}
