class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    public void setEmployeeId(int id) { employeeId = id; }
    public void setEmployeeName(String name) { employeeName = name; }
    public void setSalary(double s) {
        if (s >= 0 && s <= 1000000) salary = s;
        else System.out.println("Invalid salary");
    }
    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}
class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployeeId(101); e.setEmployeeName("Ravi");
        e.setSalary(50000); e.setSalary(-200);
        e.displayDetails();
    }
}
