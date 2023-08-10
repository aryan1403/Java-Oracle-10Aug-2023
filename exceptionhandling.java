public class exceptionhandling {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
    
            System.out.println(a);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("yeahhh it worked");
        }
    }
}
