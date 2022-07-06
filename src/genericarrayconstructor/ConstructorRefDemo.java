package genericarrayconstructor;

interface MyArrayCreator<T> {
    T[] func(int n);
}

class ConstructorRefDemo {
    public static void main(String[] args) {
        MyArrayCreator<Thread> mcArrayCons = Thread[]::new;
//        MyArrayCreator<Thread> mcArrayCons = n -> new Thread[n];
        Thread[] thrds = mcArrayCons.func(5);
    }
}
