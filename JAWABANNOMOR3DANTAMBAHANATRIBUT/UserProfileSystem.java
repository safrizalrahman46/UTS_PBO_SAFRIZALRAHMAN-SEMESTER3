package JAWABANNOMOR3DANTAMBAHANATRIBUT;

public class UserProfileSystem {
    public static void main(String[] args) {
        // Create a UserProfile instance
        UserProfile userProfile = new UserProfile(1, "password123", "Lionel Messi", 34, "messi@example.com", "doc1.pdf");
        
        // Display user profile details
        userProfile.editProfile("Lionel Andrés Messi", 35, "lionel.messi@example.com");
        userProfile.showDocuments();

        // Create a User instance and perform actions
        User user = new User(2, "password456", "Cristiano Ronaldo", 36, "ronaldo@example.com", "doc2.pdf", "Turin, Italy", "123-456-7890");
        user.logIn(2, "password456");
        System.out.println("Last Login: " + user.getLastLogin());
        user.recoverPassword();
        user.logOut();

        // Create a Customer instance and perform actions
        Customer customer = new Customer(3, "password789", "Neymar Jr", 29, "neymar@example.com", "doc3.pdf", "Gold", 1500.0);
        customer.applyVerification("new_doc.pdf");
        customer.addLoyaltyPoints(100);
        System.out.println("Verification Status: " + customer.getVerificationStatus());
        System.out.println("Loyalty Points: " + customer.getLoyaltyPoints());
        System.out.println("Membership Level: " + customer.getMembershipLevel());
        System.out.println("Account Balance: $" + customer.getAccountBalance());

        // Create an Admin instance and perform actions
        Admin admin = new Admin(4, "adminpass", "Zinedine Zidane", 48, "zidane@example.com", "admin_doc.pdf", 1, "Operations", "Manager");
        admin.updateVehicleDetails(101);
        admin.addVehicle();
        admin.retrieveComplain();
        admin.verifyUser(userProfile);
        
        // Display admin details
        System.out.println("Admin Level: " + admin.getAdminLevel());
        System.out.println("Department: " + admin.getDepartment());
        System.out.println("Role: " + admin.getRole());
    }
}
