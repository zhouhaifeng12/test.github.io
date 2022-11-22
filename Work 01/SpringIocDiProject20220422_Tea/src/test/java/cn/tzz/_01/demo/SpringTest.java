package cn.tzz._01.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 在测试方法之前启动容器
@RunWith(SpringJUnit4ClassRunner.class)
// 加载Spring配置文件
@ContextConfiguration("classpath:01.hello.xml")
public class SpringTest {
    // Person p1 = ctx.getBean(Person.class); 在测试方法之前获取容器对象
    @Autowired
    private Person person;

    @Test
    public void testDoWork() {
        person.doWork();
    }
}
