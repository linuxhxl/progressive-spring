package com.hexl.springframework.beans.factory;

import com.hexl.springframework.beans.BeansException;

/**
 * @author xhe@fintechautomation.com
 * @since 2024/5/26 15:05
 */
public interface BeanFactory {

    Object getBean(String name);

    Object getBean(String name, Object... args) throws BeansException;

}
