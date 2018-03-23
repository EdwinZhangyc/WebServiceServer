package com.zyc.server.impl;

import com.zyc.pojo.User;
import com.zyc.server.HelloWorld;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 服务接口实现
 */
@WebService(endpointInterface = "com.zyc.server.HelloWorld", serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    Map<Integer, User> users = new LinkedHashMap<Integer, User>();
    @Override
    public String sayHi(@WebParam(name = "text") String text) {
        return "hello" + text;
    }

    @Override
    public String sayHiToUser(User user) {

        users.put(users.size() + 1, user);
        return "Hello, " + user.getName();
    }

    @Override
    public String[] sayHiToUserList(List<User> userList) {

        String[] result = new String[userList.size()];
        int i = 0;
        for (User u:
             userList) {
            result[i] = "Hello, " + u.getName();
            i++;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}