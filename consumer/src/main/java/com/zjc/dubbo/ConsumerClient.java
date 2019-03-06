package com.zjc.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class ConsumerClient {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-consumer.xml");

        context.start();

        while(true){
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();

            //获取接口
            ServiceAPI serviceAPI = (ServiceAPI)context.getBean("consumerService");

            System.out.println(serviceAPI.sendMessage(message));

        }

    }
}
