package cn.tzz._02.ioc;

public class MyDataSource {
    public MyDataSource(){
        System.out.println("对象被创建了");
    }
    public void init(){
        System.out.println("初始化连接池中连接");
    }
    public void getConnection(){
        System.out.println("从连接池中获取连接");
    }
    public void destroy(){
        System.out.println("销毁连接池");
    }
}
