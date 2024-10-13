package JawbanNo1dan2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GraduateStudent19 extends Student19 {
    private final String thesisTitle; // Made final
    private final Professor19 advisor; // Made final
    private final List<ResearchProject19> researchProjects = new ArrayList<>(); // Made final

    public GraduateStudent19(String name, String phoneNumber, String emailAddress, Address19 address, Date dateOfBirth,
                             String studentNumber, float averageMark, String thesisTitle, Professor19 advisor) {
        super(name, phoneNumber, emailAddress, address, dateOfBirth, studentNumber, averageMark);
        this.thesisTitle = thesisTitle;
        this.advisor = advisor;
    }

    public void submitThesis() {
        // Implementation
    }

    public void addResearchProject(ResearchProject19 project) {
        this.researchProjects.add(project);
    }

    public List<ResearchProject19> getResearchProjects() {
        return this.researchProjects;
    }

    // Overridden method
    @Override
    public boolean isEligibleToEnroll() {
        return super.isEligibleToEnroll() && thesisTitle != null && !thesisTitle.isEmpty();
    }
}