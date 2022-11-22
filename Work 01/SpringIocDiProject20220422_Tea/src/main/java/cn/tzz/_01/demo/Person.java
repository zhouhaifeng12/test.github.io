package cn.tzz._01.demo;

public class Person {
    private String name;

    public Person() {
        System.out.println("创建Person对象");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doWork() {
        System.out.println(this.name + "我爱学习");
    }

}
