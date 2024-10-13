package JawbanNo1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student19 extends Person19 {
    private final String studentNumber; // Made final
    private float averageMark; // Kept as non-final to allow updates
    private final List<Course19> enrolledCourses = new ArrayList<>(); // Made final

    public Student19(String name, String phoneNumber, String emailAddress, Address19 address, Date dateOfBirth,
                     String studentNumber, float averageMark) {
        super(name, phoneNumber, emailAddress, address, dateOfBirth);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }

            // Getter for studentNumber
    public String getStudentNumber() {
        return studentNumber;
    }

    public void enrollInCourse(Course19 course) {
        this.enrolledCourses.add(course);
    }

    public void dropCourse(Course19 course) {
        this.enrolledCourses.remove(course);
    }

    public List<Course19> getEnrolledCourses() {
        return this.enrolledCourses;
    }

    public boolean isEligibleToEnroll() {
        return averageMark >= 75.0f; // Example condition for eligibility
    }

    // Getters and setters for averageMark
    public float getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }
}