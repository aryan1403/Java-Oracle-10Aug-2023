public interface interfacex {
    void work();
    void sing();
}

class Innerinterfacex implements interfacex {

    @Override
    public void work() {
        System.out.println("working ");
    }

    public void work(String a) {

    }

    @Override
    public void sing() {
        System.out.println("singing");
    }

    public static void main(String[] args) {
        new Innerinterfacex().work();
    }
   
}
