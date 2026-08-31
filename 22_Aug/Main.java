interface A {
    default void methodA() {
        System.out.println("A method");
    }
}

interface B {
    default void methodB() {
        System.out.println("B method");
    }
}

class C implements A, B {

    public void methodA() {
        System.out.println("C methodA");
        A.super.methodA();
    }

    public void methodB() {
        System.out.println("C methodB");
        B.super.methodB();
    }
}

public class Main {
    public static void main(String[] args) {

        C obj = new C();

        obj.methodA();
        obj.methodB();
        
    }
}