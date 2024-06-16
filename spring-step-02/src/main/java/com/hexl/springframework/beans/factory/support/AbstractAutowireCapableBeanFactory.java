package com.hexl.springframework.beans.factory.support;

import com.hexl.springframework.beans.factory.config.BeanDefinition;

/**
 * @author xhe@fintechautomation.com
 * @since 2024/5/26 15:03
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        registerSingleton(beanName, bean);
        return bean;
    }

}
