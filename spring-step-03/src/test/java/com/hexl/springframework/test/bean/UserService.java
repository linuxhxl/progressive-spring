package com.hexl.springframework.test.bean;

/**
 * @author xhe@fintechautomation.com
 * @since 2024/6/15 23:07
 */
public class UserService {

    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("Query user info." + name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }

}
