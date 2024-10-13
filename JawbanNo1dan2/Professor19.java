package JawbanNo1dan2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Professor19 extends Person19 {
    private final float salary; // Made final
    private final Department19 department; // Made final
    private final List<Course19> coursesTaught = new ArrayList<>(); // Made final
    private final List<ResearchProject19> researchProjects = new ArrayList<>(); // Made final

    public Professor19(String name, String phoneNumber, String emailAddress, Address19 address, Date dateOfBirth,
                       float salary, Department19 department) {
        super(name, phoneNumber, emailAddress, address, dateOfBirth);
        this.salary = salary;
        this.department = department;
    }

    public void assignCourse(Course19 course) {
        this.coursesTaught.add(course);
    }

    public List<Course19> getCoursesTaught() {
        return this.coursesTaught;
    }

    public void conductResearch(ResearchProject19 project) {
        this.researchProjects.add(project);
    }

    public void publishPaper(String title, String journal) {
        // Implementation
    }
}