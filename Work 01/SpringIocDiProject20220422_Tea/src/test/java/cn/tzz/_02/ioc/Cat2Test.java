package cn.tzz._02.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:02.ioc.xml")
public class Cat2Test {
    // 实现FactoryBean接口实现
    @Autowired
    private Cat2 cat2;

    @Test
    public void Test() {
        System.out.println(cat2);
    }
}
