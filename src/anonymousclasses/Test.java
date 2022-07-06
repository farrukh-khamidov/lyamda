package anonymousclasses;

public class Test {
    int a = 1;
    public static void main(String[] args) {
        int local = 10;
        A a = new A() {
        };
        B b = new B() {
            @Override
            public void print() {

                System.out.println("Print something");
            }

            @Override
            public void print2() {
                System.out.println("Print2 something");
            }
        };
        b.print();

        C c = new C() {
            static final int x = 1;
            static int y = 2;
            @Override
            public void print() {
                System.out.println(x);
            }

            @Override
            public void print2() {
                System.out.println(y);
            }

            @Override
            public void m() {
                System.out.println("Method in C");
            }
        };
        c.m();
        c.print();
        c.print2();

        D d = new D() {

        };
        System.out.println(d.x);
        System.out.println(d.y);
    }
}
