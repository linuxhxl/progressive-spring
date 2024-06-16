package com.hexl.springframework.beans.factory.config;

/**
 * @author xhe@fintechautomation.com
 * @since 2024/5/26 15:03
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);

}
