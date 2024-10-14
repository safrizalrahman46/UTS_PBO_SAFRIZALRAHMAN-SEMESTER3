package JAWABANNOMOR3DANTAMBAHANATRIBUT;

public class Admin extends UserProfile {
    private int adminLevel; // New attribute
    private String department; // New attribute
    private String role; // New attribute

    public Admin(int user_id, String password, String name, int age, String email_id, String doc, int adminLevel, String department, String role) {
        super(user_id, password, name, age, email_id, doc);
        this.adminLevel = adminLevel;
        this.department = department;
        this.role = role;
    }

    public void updateVehicleDetails(int vehicle_id) {
        System.out.println("Vehicle details for vehicle ID " + vehicle_id + " updated.");
    }

    public void addVehicle() {
        System.out.println("Vehicle added.");
    }

    public void retrieveComplain() {
        System.out.println("Complaints retrieved.");
    }

    public void verifyUser(UserProfile userProfile) {
        System.out.println(userProfile.name + " is verified.");
    }

    public int getAdminLevel() {
        return adminLevel;
    }

    public void setAdminLevel(int level) {
        this.adminLevel = level;
    }

    public String getDepartment() {
        return department;
    }

    public String getRole() {
        return role;
    }
}
