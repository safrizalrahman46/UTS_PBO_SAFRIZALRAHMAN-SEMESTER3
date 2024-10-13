package JawabanNomor3;

public class Admin extends UserProfile {
    public Admin(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
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
}
