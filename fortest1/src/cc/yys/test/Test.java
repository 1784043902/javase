package cc.yys.test;

/**
 * 包名:cc.yys.test
 *
 * @author youyisen
 * 日期:2021-03-16  23-12-25
 */
public class Test{
    public Test(){
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        s2.a = 20;
        Test.Inner s3 = new Test.Inner();
        System.out.println(s3.a);
    }
    class Inner{
        public int a = 5;
    }
    public static void main(String[] args) {
        Test t = new Test();
        Inner r = t.new Inner();
        System.out.println(r.a);

        String s = "a";
        String s1 = "a";
        System.out.println(s == s1);


        final int num;
        num = 1;

        Outer out = inners();
        out.innerMethod();

        new Outer2(){
            private void show2(){
                System.out.println();
            }
        };

        double obj = true ? new Integer(1):new Double(2.0);

        Integer i = new Integer(1);
        Double d = new Double(2);
        double d1 = i + d;
        String s11 = "a";
    }

    public static Outer inners(){
        class InnerInner extends Outer{
            public void innerMethod(){
                System.out.println("局部内部类被调用了");

            }
        }
        return new InnerInner();
    }
}

class Outer{

    public void innerMethod(){

    }
}

class Outer2{
    private int age = 2;

    public void show() throws NullPointerException{
        System.out.println("我");
    }
}

class Outer3 extends Outer2{

    public void show() throws RuntimeException{
        System.out.println("我");


    }
}
