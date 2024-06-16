package com.hexl.springframework;

/**
 * @author Tom He
 * @since 2024/5/26 14:23
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
