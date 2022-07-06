package lyamda;

import java.security.PrivilegedAction;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        PrivilegedAction<Double> doublePrivilegedAction = () -> 98.6;
        System.out.println(doublePrivilegedAction.run());
        System.out.println(myMeth());

        PrivilegedAction<Double> action = () -> Math.random() * 100;
        System.out.println(action.run());

//        PrivilegedAction<Double> action1 = (n) -> 1.0 / n;
//        System.out.println(action1.run());

        // Create a reference to a MyValue instance.
        MyValue myVal;
        // Use a lambda in an assignment context.
        myVal = () -> 98.6;

        // Call getValue(), which is implemented by the previously assigned
        // lambda expression.
        System.out.println("A constant value: " + myVal.getValue());

        MyParamValue myPval = (n) -> 1.0 / n;
        System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));

        Comparator<String> comp
                = (first, second) -> first.length() - second.length();



    }
    static double myMeth() { return 98.6; }

}
