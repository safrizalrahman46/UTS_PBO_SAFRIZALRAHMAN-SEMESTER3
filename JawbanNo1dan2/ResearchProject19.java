package JawbanNo1dan2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResearchProject19 {
    private final String projectName; // Made final
    private final String description; // Made final
    private final Date startDate; // Made final
    private final Date endDate; // Made final
    private final List<Person19> researchers = new ArrayList<>(); // Made final

    public ResearchProject19(String projectName, String description, Date startDate, Date endDate) {
        this.projectName = projectName;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void addResearcher(Person19 researcher) {
        this.researchers.add(researcher);
    }

    public void removeResearcher(Person19 researcher) {
        this.researchers.remove(researcher);
    }

    public int getProjectDuration() {
        long duration = endDate.getTime() - startDate.getTime();
        return (int) (duration / (1000 * 60 * 60 * 24));
    }

    // Getters for project details
    public String getProjectName() {
        return projectName;
    }

    public String getDescription() {
        return description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
