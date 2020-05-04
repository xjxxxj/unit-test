package xjx.study.demo.unit.test.mockito.inject;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl {

    public Map<String, Map<String, String>> getList() {
        Map<String, Map<String, String>> userList = new HashMap<>();
        Map<String, String> user = new HashMap<>();
        user.put("name", "xjx");
        user.put("age", "25");
        userList.put(user.get("name"), user);
        this.doSomethingElse();
        return userList;
    }

    private String doSomethingElse() {
        System.out.println("do something else");
        throw new RuntimeException("error");
    }
}
