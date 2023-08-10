public class methodex {
    public void work() {
        // body
        System.out.println("working...");
    }

    // Method overloading
    public String name(String s) {
        return s;
    }
    public int name() {
        return 10;
    }
    
    public static double sum(double a, double b) {
        return (a + b);
    }
    static int a = -10;
    public static void main(String[] args) {
        int a = 9;
        methodex m = new methodex();
        // m.work();
        // System.out.println(m.name("Aaryan is the trainer"));
        System.out.println("sum = " + sum(a, 20));
        m.name();
        m.name("Arush");
    }
}
