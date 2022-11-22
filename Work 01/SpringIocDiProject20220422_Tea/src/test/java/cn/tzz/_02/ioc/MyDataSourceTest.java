package cn.tzz._02.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:02.ioc.xml")
public class MyDataSourceTest {
    @Autowired
    private MyDataSource m1;
    @Autowired
    private MyDataSource m2;
    @Test
    public void Test(){
        System.out.println(m1);
        m1.getConnection();
        System.out.println(m2);
        m2.getConnection();

    }
}
