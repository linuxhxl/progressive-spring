package com.hexl.springframework.test;

import com.hexl.springframework.beans.factory.config.BeanDefinition;
import com.hexl.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.hexl.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author xhe@fintechautomation.com
 * @since 2024/6/15 23:07
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }

}
