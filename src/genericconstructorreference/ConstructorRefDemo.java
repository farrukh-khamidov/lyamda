package genericconstructorreference;

// Demonstrate a Constructor reference.
// MyFunc is a functional interface whose method returns
// a MyClass reference.
interface MyFunc<T> {
    MyGenClass<T> func(T item);
}

class MyGenClass<T> {
    private T item;

    // This constructor takes an argument.
    MyGenClass(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}

class ConstructorRefDemo {
    public static void main(String[] args) {

        MyFunc<Integer> myClassCons = MyGenClass<Integer>::new;

        MyGenClass<Integer> mc = myClassCons.func(212);

        System.out.println("str in mc is " + mc.getItem());
    }
}
