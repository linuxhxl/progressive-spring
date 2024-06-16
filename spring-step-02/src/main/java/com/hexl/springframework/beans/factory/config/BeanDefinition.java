package com.hexl.springframework.beans.factory.config;

/**
 * @author xhe@fintechautomation.com
 * @since 2024/5/26 15:02
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
