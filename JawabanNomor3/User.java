package JawabanNomor3;

public class User extends UserProfile {
    // Constructor
    public User(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
    }

    // Methods
    public void logIn(int user_id, String password) {
        if (this.user_id == user_id && this.password.equals(password)) {
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
}
