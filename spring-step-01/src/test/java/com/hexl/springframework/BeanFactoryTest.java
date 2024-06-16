package com.hexl.springframework;

import org.junit.Test;

/**
 * @author Tom He
 * @since 2024/5/26 14:29
 */
public class BeanFactoryTest {

    @Test
    public void factoryTest() {
        BeanFactory beanFactory = new BeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
