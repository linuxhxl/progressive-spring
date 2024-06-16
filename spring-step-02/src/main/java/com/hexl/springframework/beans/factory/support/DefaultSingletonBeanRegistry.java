package com.hexl.springframework.beans.factory.support;

import com.hexl.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xhe@fintechautomation.com
 * @since 2024/5/26 15:04
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    @Override
    public void registerSingleton(String beanName, Object singletoObject) {
        singletonObjects.put(beanName, singletoObject);
    }
}
