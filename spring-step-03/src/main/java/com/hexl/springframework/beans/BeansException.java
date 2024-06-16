package com.hexl.springframework.beans;

/**
 * @author xhe@fintechautomation.com
 * @since 2024/5/26 15:06
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
