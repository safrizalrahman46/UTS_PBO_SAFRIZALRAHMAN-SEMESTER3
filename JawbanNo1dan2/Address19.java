package JawbanNo1dan2;
class Address19 {
    private final String street;
    private final String city;
    private final String state;
    private final String postalCode;
    private final String country;

    public Address19(String street, String city, String state, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public boolean validate() {
        return street != null && !street.isEmpty() && city != null && !city.isEmpty();
    }

    public String outputAsLabel() {
        return street + ", " + city + ", " + state + ", " + postalCode + ", " + country;
    }
}