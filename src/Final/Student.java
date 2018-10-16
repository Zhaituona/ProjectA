package Final;

public class Student {
    int studentId = 123;
    String studentName;

    public void studentId() {
        System.out.println(studentId);
    }

    public final String studentName() {
        System.out.println("abc");
        return studentName;
    }

}











