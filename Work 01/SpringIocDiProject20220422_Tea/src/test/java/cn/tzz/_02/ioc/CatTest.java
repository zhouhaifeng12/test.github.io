package cn.tzz._02.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
// 在测试方法之前启动容器
@RunWith(SpringJUnit4ClassRunner.class)
// 加载Spring配置文件
@ContextConfiguration("classpath:02.ioc.xml")
public class CatTest {
    // 1.构造器实例化
    @Autowired
    private Cat1 cat;

    @Test
    public void cat1Test(){
        System.out.println(cat);
    }

}
