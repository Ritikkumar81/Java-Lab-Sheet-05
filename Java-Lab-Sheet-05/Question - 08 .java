class Person {
    String name;
    void displayName() { System.out.println("Name: " + name); }
}
class Employee extends Person {
    int employeeId;
    void displayEmployee() {
        displayName();
        System.out.println("Employee ID: " + employeeId);
    }
}
class Manager extends Employee {
    String department;
    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}
class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Amit"; m.employeeId = 501; m.department = "Sales";
        m.displayManager();
    }
}
