@FunctionalInterface
interface in {
    int work(int a);
}

interface in2 {
    void work();
    void play();
}

class inex implements in {

    @Override
    public int work(int a) {
        System.out.println("working");
        return a;
    }

}

public class lambdaex {
    public static void main(String[] args) {
        // in obj1 = new in(); wrong 
        in obj = (int a) -> {
            return a;
        };
        // in obj = new inex();
        obj.work(10);

        in2 obj2 = new in2() {

            @Override
            public void work() {
                System.out.println("hey im working");
            }

            @Override
            public void play() {
                System.out.println("playing");
            }
            
        };

        obj2.work();
        obj2.play();
    }
}
