package arrayconstructor;

interface MyClassArrayCreator {
    MyClass[] func(int n);
}

class MyClass {
    private String str;

    // This constructor takes an argument.
    MyClass(String s) {
        str = s;
    }

    // This is the default constructor.
    MyClass() {
        str = "";
    }

    // ...
    String getStr() {
        return str;
    }
}

class ConstructorRefDemo {
    public static void main(String[] args) {
        MyClassArrayCreator mcArrayCons = MyClass[]::new;
//        MyClassArrayCreator mcArrayCons = n -> new MyClass[n];
        MyClass[] a = mcArrayCons.func(3);
        for(int i=0; i < 3; i++)
            a[i] = new MyClass(i+"");
    }
}
