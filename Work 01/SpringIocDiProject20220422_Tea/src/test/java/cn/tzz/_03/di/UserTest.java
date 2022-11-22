package cn.tzz._03.di;

import org.junit.Test;

public class UserTest {

    @Test
    public void test(){
        User user = new User();
        // 属性的Setter注入值
        user.setName("张某");

        // 构造器注入
        User user1 = new User("拉拉");
    }
}
