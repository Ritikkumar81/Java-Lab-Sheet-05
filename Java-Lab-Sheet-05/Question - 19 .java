class Employee {
    private String name;
    private int employeeId;
    public void setDetails(String n, int id) { name = n; employeeId = id; }
    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}
interface Programmer { void writeCode(); }
interface Researcher { void conductResearch(); }
class Developer extends Employee implements Programmer, Researcher {
    public void writeCode() { System.out.println("Developer writes code"); }
    public void conductResearch() { System.out.println("Developer conducts research"); }
}
class Main {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.setDetails("Ravi", 201);
        d.displayEmployee(); d.writeCode(); d.conductResearch();
    }
}
