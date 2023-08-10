public class Employee {
    String id;
    String name;
    String gender;
    String role;
    double salary;
    double exp;

    public Employee(String id, String name, String gender, String role, double salary, double exp) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.role = role;
        this.salary = salary;
        this.exp = exp;
    }

    public Employee() {

    }

    

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", role=" + role + ", salary=" + salary
                + ", exp=" + exp + "]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }
}
