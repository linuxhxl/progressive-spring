package com.hexl.springframework.beans.factory.support;

import com.hexl.springframework.beans.factory.config.BeanDefinition;

/**
 * @author xhe@fintechautomation.com
 * @since 2024/5/26 15:04
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
