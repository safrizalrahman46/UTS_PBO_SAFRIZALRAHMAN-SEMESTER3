package JAWABANNOMOR3DANTAMBAHANATRIBUT;
import java.util.Date;

public class User extends UserProfile {
    private Date lastLogin; // New attribute
    private String address; // New attribute
    private String phoneNumber; // New attribute

    public User(int user_id, String password, String name, int age, String email_id, String doc, String address, String phoneNumber) {
        super(user_id, password, name, age, email_id, doc);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void logIn(int user_id, String password) {
        if (this.user_id == user_id && this.password.equals(password)) {
            lastLogin = new Date(); // Update last login
            System.out.println("User " + name + " logged in.");
        } else {
            System.out.println("Login failed. Invalid credentials.");
        }
    }

    public void recoverPassword() {
        System.out.println("Password recovery for " + email_id);
    }

    public void logOut() {
        System.out.println("User " + name + " logged out.");
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
