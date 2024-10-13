package JawabanNomor3;

public class UserProfileSystem {
    public static void main(String[] args) {
        // Create UserProfile instance
        UserProfile userProfile = new UserProfile(1, "password123", "Lionel Messi", 34, "messi@example.com", "doc1.pdf");

        // Create User instance and perform actions
        User user = new User(2, "password456", "Cristiano Ronaldo", 36, "ronaldo@example.com", "doc2.pdf");
        user.logIn(2, "password456");
        user.recoverPassword();
        user.logOut();

        // Create Customer instance and perform actions
        Customer customer = new Customer(3, "password789", "Neymar Jr", 29, "neymar@example.com", "doc3.pdf");
        customer.applyVerification("new_doc.pdf");
        System.out.println("Verification Status: " + customer.getVerificationStatus());

        // Create Admin instance and perform actions
        Admin admin = new Admin(4, "adminpass", "Zinedine Zidane", 48, "zidane@example.com", "admin_doc.pdf");
        admin.updateVehicleDetails(101);
        admin.addVehicle();
        admin.retrieveComplain();
        admin.verifyUser(userProfile);
    }
}
