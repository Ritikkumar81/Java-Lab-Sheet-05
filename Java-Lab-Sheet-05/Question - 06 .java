class Employee {
    private String name;
    private double salary;
    public void setName(String n) { name = n; }
    public void setSalary(double s) { salary = s; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
}
class Manager extends Employee {
    String department;
    void displayManager() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + department);
    }
}
class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("Karan"); m.setSalary(60000); m.department = "IT";
        m.displayManager();
    }
}
