package com.example.mqtt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author: zhangxu
 * @date: 2023-08-04
 */
@SpringBootApplication
@MapperScan(basePackages = "com.example.mqtt.mapper")
public class MqttApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqttApplication.class, args);
        System.out.println("Starting....");

    }



}
