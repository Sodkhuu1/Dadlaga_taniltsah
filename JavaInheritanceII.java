import java.io.*;
import java.util.*;

class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    
}
public class JavaInheritanceII {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.print(a.add(20, 22) + " ");
        System.out.print(a.add(10, 3) + " ");
        System.out.print(a.add(11, 9));
    }
}