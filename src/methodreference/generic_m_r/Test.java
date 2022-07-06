package methodreference.generic_m_r;

interface SomeTest<T> {
    boolean test(T n, T m);
}
class MyClass {
    static <T> boolean myGenMeth(T x, T y) {
        boolean result = false;
        // ...
        return result;
    }
}

public class Test {
    public static void main(String[] args) {
        SomeTest<Integer> mRef = MyClass::<Integer>myGenMeth;

        System.out.println(mRef.test(2,3));
    }
}
