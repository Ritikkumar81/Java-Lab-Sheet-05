class Person {
    String name;
    void displayName() { System.out.println("Name: " + name); }
}
class Student extends Person {
    String course;
    void study() { System.out.println(course + " student is studying"); }
}
class Teacher extends Person {
    String subject;
    void teach() { System.out.println("Teaches: " + subject); }
}
class Main {
    public static void main(String[] args) {
        Student s = new Student(); s.name = "Riya"; s.course = "BCA";
        Teacher t = new Teacher(); t.name = "Mr. Raj"; t.subject = "Java";
        s.displayName(); System.out.println("Course: " + s.course); s.study();
        t.displayName(); t.teach();
    }
}
