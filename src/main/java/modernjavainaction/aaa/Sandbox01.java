package modernjavainaction.aaa;

import java.util.*;

import static java.util.Comparator.*;

public class Sandbox01 {

    public static void main(String[] args) {


        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 42, 3));
        System.out.println(l1);

        Collections.sort(l1, comparingInt(i -> i));

        System.out.println(l1);

        System.out.println("Hello");

    }
}
