package com.demo.server.ext.web;

import com.demo.base.common.utils.LogUtils;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@EnableAsync
@EnableScheduling
@EnableTransactionManagement
@MapperScan({ "com.demo.server.ext.dal.mapper" })
@SpringBootApplication(scanBasePackages = { "com.demo.*" })
public class DemoServerExtApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServerExtApplication.class, args);
        log.info(LogUtils.getLogMessage("Server extensive application has been started successfully"));
    }
}
