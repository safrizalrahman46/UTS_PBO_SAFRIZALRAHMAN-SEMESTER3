package JawbanNo1dan2;

import java.util.Date;

public class Person19 {
    private final String name; // Made final
    private String phoneNumber; // Kept as non-final to allow updates
    private String emailAddress; // Kept as non-final to allow updates
    private final Address19 address; // Made final
    private final Date dateOfBirth; // Made final

    public Person19(String name, String phoneNumber, String emailAddress, Address19 address, Date dateOfBirth) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public void purchaseParkingPass() {
        System.out.println(name + " purchased a parking pass.");
    }

    public void updateContactDetails(String phoneNumber, String emailAddress) {
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getFullName() {
        return this.name;
    }

    public void updateContactDetails(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void updateContactDetails() {
        this.phoneNumber = "Unknown";
        this.emailAddress = "Unknown";
    }
}
