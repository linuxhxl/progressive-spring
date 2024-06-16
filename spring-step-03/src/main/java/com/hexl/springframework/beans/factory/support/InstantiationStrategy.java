package com.hexl.springframework.beans.factory.support;

import com.hexl.springframework.beans.BeansException;
import com.hexl.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author xhe@fintechautomation.com
 * @since 2024/6/16 15:07
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
