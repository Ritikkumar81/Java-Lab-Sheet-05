interface Researcher { void conductResearch(); }
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    public void setEmployeeId(int id) { employeeId = id; }
    public void setEmployeeName(String name) { employeeName = name; }
    public void setSalary(double s) { if (s >= 0) salary = s; }
    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + employeeName);
    }
    double calculateSalary() { return salary; }
}
class Teacher extends Employee implements Researcher {
    String subject;
    void teach() { System.out.println("Teaching " + subject); }
    public void conductResearch() { System.out.println("Research in " + subject); }
    @Override
    double calculateSalary() { return super.calculateSalary() + 5000; }
}
class VisitingTeacher extends Teacher {
    int hoursWorked;
    @Override
    double calculateSalary() { return hoursWorked * 500; }
}
class Admin extends Employee {
    String department;
    void manageDepartment() { System.out.println("Managing " + department); }
}
class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setEmployeeId(1); t.setEmployeeName("Asha"); t.setSalary(40000);
        t.subject = "Java"; t.displayDetails(); t.teach(); t.conductResearch();
        System.out.println("Teacher Salary: " + t.calculateSalary());
        VisitingTeacher v = new VisitingTeacher();
        v.setEmployeeId(2); v.setEmployeeName("Ravi"); v.hoursWorked = 20;
        v.displayDetails(); System.out.println("Visiting Salary: " + v.calculateSalary());
        Admin a = new Admin();
        a.setEmployeeId(3); a.setEmployeeName("Neeraj"); a.setSalary(35000);
        a.department = "Accounts"; a.displayDetails(); a.manageDepartment();
        System.out.println("Admin Salary: " + a.calculateSalary());
    }
}
