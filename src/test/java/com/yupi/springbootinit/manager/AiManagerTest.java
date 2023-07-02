package com.yupi.springbootinit.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class AiManagerTest {

    @Resource
    private AiManager aiManager;

    @Test
    void doChat(){
        String question = "分析需求:\n分析网站用户的增⻓情况\n" +
                "原始数据:\n日期,用户数\n1号,10\n2号,20\n3号,30\n";
//        System.out.println(aiManager.doChat(question));
    }
}
