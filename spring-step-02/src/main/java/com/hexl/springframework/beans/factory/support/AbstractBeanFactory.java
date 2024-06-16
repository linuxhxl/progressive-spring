package com.hexl.springframework.beans.factory.support;

import com.hexl.springframework.beans.factory.BeanFactory;
import com.hexl.springframework.beans.factory.config.BeanDefinition;

/**
 * @author xhe@fintechautomation.com
 * @since 2024/5/26 15:04
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) {
        Object object = getSingleton(name);
        if (object != null) {
            return object;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition);

}
