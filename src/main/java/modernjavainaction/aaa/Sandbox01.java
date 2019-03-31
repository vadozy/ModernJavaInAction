package modernjavainaction.aaa;

import java.util.*;
import java.util.function.Function;

import static java.util.Comparator.*;

public class Sandbox01 {

    public static void main(String[] args) {

        System.out.println("Original");
        List<Integer> l1 = new ArrayList<>(Arrays.asList(2, 1, 42, 3));
        System.out.println(l1);

        System.out.println("Lambda identity");
        l1.sort(comparingInt(i -> i));
        System.out.println(l1);

        System.out.println("Function lambda reversed");
        Function<Integer, Integer> f1 = i -> -i;
        l1.sort(comparingInt(f1::apply));
        System.out.println(l1);

        System.out.println("Function identity");
        l1.sort(comparingInt(Function.<Integer>identity()::apply));
        System.out.println(l1);

    }
}
