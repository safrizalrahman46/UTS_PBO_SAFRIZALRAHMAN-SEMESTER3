package JAWABANNOMOR3DANTAMBAHANATRIBUT;

public class Customer extends UserProfile {
    private boolean verificationStatus;
    private int loyaltyPoints; // New attribute
    private String membershipLevel; // New attribute
    private double accountBalance; // New attribute

    public Customer(int user_id, String password, String name, int age, String email_id, String doc, String membershipLevel, double accountBalance) {
        super(user_id, password, name, age, email_id, doc);
        this.verificationStatus = false;
        this.loyaltyPoints = 0; // Initialize loyalty points
        this.membershipLevel = membershipLevel;
        this.accountBalance = accountBalance;
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(String doc) {
        this.doc = doc;
        this.verificationStatus = true;
        System.out.println(name + " applied for verification with document: " + doc);
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}
