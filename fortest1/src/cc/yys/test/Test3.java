package cc.yys.test;

import java.io.IOException;
import java.util.HashMap;

/**
 * 包名:cc.yys.test
 *
 * @author youyisen
 * 日期:2021-03-26  22-29-05
 */
public class Test3 {

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer s = null;


        Object o1 = "";
        String ss = "a";
        String sss = "n";
        String s1 = ss +","+ sss;
        HashMap hm = new HashMap(17, 0.75f);
        hm.put("ss", 1);
    }
}

class c1{

    public void show() throws NullPointerException{

    }
}

class c2 extends c1{

    public void show(){

    }
}
