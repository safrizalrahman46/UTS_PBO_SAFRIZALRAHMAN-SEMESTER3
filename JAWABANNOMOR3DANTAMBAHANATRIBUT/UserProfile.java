package JAWABANNOMOR3DANTAMBAHANATRIBUT;

public class UserProfile {
    protected int user_id;
    protected String password;
    protected String name;
    protected int age;
    protected String email_id;
    protected String doc; // .jpg, .png, .pdf

    // Constructor
    public UserProfile(int user_id, String password, String name, int age, String email_id, String doc) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        this.doc = doc;
    }

    // Getters
    public int getUserId() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailId() {
        return email_id;
    }

    // Methods
    public void editProfile(String name, int age, String email_id) {
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        System.out.println("Profile updated.");
    }

    public void showDocuments() {
        System.out.println("Showing documents for user: " + name);
    }
}
