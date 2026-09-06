public class Student extends Person {
    private int rollNo;
    private String course;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void displayStudentDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}
