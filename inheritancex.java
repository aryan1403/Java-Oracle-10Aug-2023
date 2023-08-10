// Super class

class B {
    static void cat() {
        System.out.println("meow");
    }
}
class A extends B {
    public static void work() {
        System.out.println("working");
    }
    static void sing() {
        System.out.println("singing");
    }
}

// Sub class
public class inheritancex extends A {
    public static void main(String[] args) {
        work();
        sing();
        cat();
    }
}

