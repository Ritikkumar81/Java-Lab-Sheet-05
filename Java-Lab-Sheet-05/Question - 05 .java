class Person {
    String name;
    int age;
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    int rollNo;
    String course;
    void displayStudent() {
        displayPerson();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}
class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Neha"; s.age = 20; s.rollNo = 12; s.course = "BCA";
        s.displayStudent();
    }
}
