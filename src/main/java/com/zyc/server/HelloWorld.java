package com.zyc.server;

import com.zyc.pojo.User;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * 编写服务接口
 */
@WebService
public interface HelloWorld {

    String sayHi(@WebParam(name="text") String text);
    String sayHiToUser(User user);
    String[] sayHiToUserList(List<User> userList);
}
