package cc.yys.test;

import java.util.ArrayList;

/**
 * 包名:cc.yys.test
 *
 * @author youyisen
 * 日期:2021-03-22  17-05-30
 */
public class Test2 {

    public static void main(String[] args) {
        String s1 = new String("A");
        String s2 = s1;
        String s3 = s1;
        Animal a = new Animal(s1);
        Animal a2 = new Animal(s1);
        String str = null;
        System.out.println(a.name == a2.name);
        System.out.println(s2 == s3);
        System.out.println(str);

    }
}

class Animal{
    String name;

    public Animal(String name){
        this.name = name;
    }
}