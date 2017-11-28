package com.dubbot.demo.comsumer;

import com.dubbo.demo.service.BroadCastMsg;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 魏霖涛
 * @since 2017/11/28
 */
public class Consumer {
    public static void main(String[] args) {

        //测试常规服务
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        System.out.println("consumer1 start");
        BroadCastMsg demoService = context.getBean(BroadCastMsg.class);
        System.out.println("consumer1");
        System.out.println(demoService.sendMsg(Consumer.class.toString()));
    }
}
