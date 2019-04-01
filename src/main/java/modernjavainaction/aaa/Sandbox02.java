package modernjavainaction.aaa;

public class Sandbox02 {

    public static void main(String[] args) {

        //A a = new A(12, 34, 211);
        int[] ar = {1, 2, 3};
        C a = A::new;
        System.out.println(a.build(ar));

    }

    static class A {
        int a;
        int b;
        int c;

        A(int... RGB) {
            this.a = RGB[0];
            this.b = RGB[1];
            this.c = RGB[2];
        }

        /*
        A(int[] RGB) {
            this.a = RGB[0];
            this.b = RGB[1];
            this.c = RGB[2];
        }
        */

        @Override
        public String toString() {
            return String.format("R: 0x%02X, G: 0x%02X, B: 0x%02X", a, b, c );
        }
    }

    static interface C {
        A build(int[] ar);
    }
}
