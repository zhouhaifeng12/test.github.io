package cn.tzz._01.demo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

    @Test
    public void doWork(){
        Person p = new Person();
        p.setName("张某");
        p.doWork();
    }
    @Test
    public void doWorkByIoc(){
        System.out.println("111");
        // 根据配置文件启动Spring容器,对象是在容器启动的时候创建的
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:01.hello.xml");
        // 从容器中根据bean 标签中的 id 获取 ID的名字
        Person p = (Person) ctx.getBean("person");
        p.doWork();
        Person p1 = ctx.getBean(Person.class);
        p1.doWork();
        Person person = ctx.getBean("person", Person.class);
        person.doWork();

    }
}
