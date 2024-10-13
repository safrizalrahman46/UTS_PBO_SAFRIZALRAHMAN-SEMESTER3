package JawbanNo1dan2;

import java.util.ArrayList;
import java.util.List;

public class Course19 {
    private final String courseCode; // Made final
    private final String courseName; // Made final
    private final int credits; // Made final
    private final Professor19 instructor; // Made final
    private final List<Student19> enrolledStudents = new ArrayList<>(); // Made final

    public Course19(String courseCode, String courseName, int credits, Professor19 instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.instructor = instructor;
    }

    public void enrollStudent(Student19 student) {
        this.enrolledStudents.add(student);
    }

    public void unenrollStudent(Student19 student) {
        this.enrolledStudents.remove(student);
    }

    public List<Student19> getEnrolledStudents() {
        return this.enrolledStudents;
    }

    public float calculateAverageGrade() {
        // Implementation for calculating average grade
        return 0.0f;
    }

    // Getters for fields that might be needed elsewhere
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public Professor19 getInstructor() {
        return instructor;
    }
}
