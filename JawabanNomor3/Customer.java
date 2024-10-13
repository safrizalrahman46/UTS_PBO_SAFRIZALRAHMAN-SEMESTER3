package JawabanNomor3;

public class Customer extends UserProfile {
    private boolean verificationStatus;

    public Customer(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
        this.verificationStatus = false;
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(String doc) {
        this.doc = doc;
        this.verificationStatus = true;
        System.out.println(name + " applied for verification with document: " + doc);
    }
}
