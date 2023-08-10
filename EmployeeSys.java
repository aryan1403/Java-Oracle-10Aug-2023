import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class EmployeeSys {
    static ArrayList<Employee> list = new ArrayList<>();
    public static void menu() {
        System.out.println("Employee Management System : ");
        System.out.println("1. Add an Employee");
        System.out.println("2. Delete an Employee");
        System.out.println("3. View all Employee's");
        System.out.println("4. Exit");
        System.out.print("\nEnter your choice : ");
    }
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);
            
            menu();
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    String id = UUID.randomUUID().toString();
                    System.out.println("Enter your name : ");
                    String name = sc1.nextLine();
                    System.out.println("Enter your gender : ");
                    String gender = sc1.nextLine();
                    System.out.println("Enter your role : ");
                    String role = sc1.nextLine();
                    System.out.println("Enter your salary : ");
                    double salary = sc.nextDouble();
                    System.out.println("Enter your experience : ");
                    double exp = sc.nextDouble();
    
                    Employee e = new Employee(id, name, gender, role, salary, exp);
                    list.add(e);
                    break;
                case 2:
                    String ename = sc1.nextLine();
                    for (Employee emp : list) {
                        if(emp.getName().equalsIgnoreCase(ename)) {
                            list.remove(emp);
    
                            System.out.println("Successfully Removed Employee\n" + emp.toString());
                        }
                    }
                    break;
                case 3:
                    list.forEach(emp -> System.out.println(emp.toString()));
                    break;
                case 4:
                    System.out.println("Thanks for using our Employee system");
                    System.exit(0); // Exit the program
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }
    }
}
