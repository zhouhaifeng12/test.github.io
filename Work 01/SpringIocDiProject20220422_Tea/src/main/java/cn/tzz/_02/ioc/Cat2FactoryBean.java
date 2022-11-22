package cn.tzz._02.ioc;

import org.springframework.beans.factory.FactoryBean;

// 实例工厂类
public class Cat2FactoryBean implements FactoryBean<Cat2> {
    // 创建对象的方法 给Spring用 创建对象的时候用
    @Override
    public Cat2 getObject() throws Exception {
        Cat2 cat2 = new Cat2();
        return cat2;
    }

    // 判断类型用的方法 给Spring用
    @Override
    public Class<?> getObjectType() {
        return Cat2.class;
    }
}
