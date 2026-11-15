class Employee {
    String employeeName;
    int employeeId;
    void displayEmployee() {
        System.out.println("Name: " + employeeName + ", ID: " + employeeId);
    }
}
class Developer extends Employee {
    String programmingLanguage;
    void writeCode() { System.out.println("Writes " + programmingLanguage + " code"); }
}
class Manager extends Employee {
    String department;
    void conductMeeting() { System.out.println("Manages " + department + " department"); }
}
class Main {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.employeeName = "Aman"; d.employeeId = 11; d.programmingLanguage = "Java";
        Manager m = new Manager();
        m.employeeName = "Rohit"; m.employeeId = 12; m.department = "HR";
        d.displayEmployee(); d.writeCode(); m.displayEmployee(); m.conductMeeting();
    }
}
