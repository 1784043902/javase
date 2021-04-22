package cc.yys.interfacetest;

/**
 * 包名:cc.yys.interfacetest
 *
 * @author youyisen
 * 日期:2021-03-16  22-30-35
 */
public class InterfaceTest {

    public static void main(String[] args) {
//        System.out.println(new test1());
//        System.out.println(new C() {
//        }.a);

//        System.out.println(new D().a);
    }
}

interface A{
    int a = 1;

    default void study(){

    }
}

interface B{
    int a = 1;

    default void study(){

    }
}

//class test1 implements A,B{
//    int a;
//
//}

interface C extends A,B{
    int a = 2;
    default void study(){

    }
}

//class D extends test1 implements A,B{
//    int a;
//}
