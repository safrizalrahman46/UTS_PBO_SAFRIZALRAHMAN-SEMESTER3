package JawbanNo1;

import java.util.Date;

public class MainyaMadeBySafrizal {
    public static void main(String[] args) {
        // Create Address instances
        Address19 address1 = new Address19("123 Main St", "Springfield", "IL", "62704", "USA");
        Address19 address2 = new Address19("456 Elm St", "Springfield", "IL", "62704", "USA");

        // Create Department instance
        Department19 compSciDepartment = new Department19("Computer Science");

        // Create Professor instance
        Professor19 professor = new Professor19("Dr. Jane Doe", "555-1234", "jane.doe@example.com", address1, new Date(), 90000, compSciDepartment);

        // Create Course instance
        Course19 course = new Course19("CS101", "Introduction to Computer Science", 3, professor);

        // Create Student instance
        Student19 student = new Student19("John Smith", "555-5678", "john.smith@example.com", address2, new Date(), "S123456", 85.0f);

        // Enroll Student in Course
        student.enrollInCourse(course);
        course.enrollStudent(student);

        // Create GraduateStudent instance
        GraduateStudent19 gradStudent = new GraduateStudent19("Alice Johnson", "555-9101", "alice.johnson@example.com", address2, new Date(), "G654321", 90.0f, "Quantum Computing", professor);

        // Create ResearchProject instance
        ResearchProject19 researchProject = new ResearchProject19("Quantum Algorithms", "Research on quantum algorithms", new Date(), new Date());
        gradStudent.addResearchProject(researchProject);
        researchProject.addResearcher(gradStudent);

        // Assign the course to the professor
        professor.assignCourse(course);

        // Professor conducts research on the project
        professor.conductResearch(researchProject);

        // Output details
        System.out.println(professor.getFullName() + " is teaching " + course.getCourseName());
        System.out.println(student.getFullName() + " is enrolled in " + course.getCourseName());
        System.out.println(gradStudent.getFullName() + " is working on research project " + researchProject.getProjectName());
        System.out.println("Department: " + professor.getDepartment().getDepartmentName());

        // Example to validate Address
        System.out.println("Is Address1 valid? " + address1.validate());
        System.out.println("Address1 Label: " + address1.outputAsLabel());

        // Simulate graduate student submitting a thesis
        gradStudent.submitThesis();

        // Professor publishes a paper
        professor.publishPaper("Advanced Quantum Mechanics", "International Journal of Quantum Physics");
    }
}
