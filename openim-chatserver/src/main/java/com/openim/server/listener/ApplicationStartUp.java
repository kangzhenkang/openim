package com.openim.server.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by shihuacai on 2015/7/21.
 * 系统启动监听器
 */
public class ApplicationStartUp implements ApplicationListener<ContextRefreshedEvent> {
    public static ApplicationContext applicationContext;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        applicationContext = event.getApplicationContext();
    }
}