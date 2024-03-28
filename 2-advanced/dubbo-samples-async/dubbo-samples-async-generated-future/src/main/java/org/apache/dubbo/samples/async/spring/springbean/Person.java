package org.apache.dubbo.samples.async.spring.springbean;

public class Person {
    private String name;
    private int age;

    public void myInit() {
        System.out.println("my init");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
