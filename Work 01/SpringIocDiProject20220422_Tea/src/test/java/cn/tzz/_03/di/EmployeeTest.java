package cn.tzz._03.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:03.di.xml")
public class EmployeeTest {
    @Autowired
    private Employee el;
    @Test
    public void test(){
        System.out.println(el);
    }
}
