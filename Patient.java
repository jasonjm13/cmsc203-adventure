package assignment2;

/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Defines a Patient with all identifying and contact information.
 * Due: 07/27/2024
 * Platform/compiler: Eclipse / Java 17
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Student Name: Jason Martin
 */

public class Patient {
    // Instance variables for patient personal and contact information
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String emergencyContactName;
    private String emergencyContactPhone;

    /*
     * No-argument constructor initializes an empty Patient object.
     */
    public Patient() {
        // Fields default to null
    }

    /*
     * Constructor initializing patient's name fields.
     * 
     * @param firstName patient's first name
     * @param middleName patient's middle name
     * @param lastName patient's last name
     */
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    /*
     * Full constructor initializing all patient fields.
     * 
     * @param firstName patient's first name
     * @param middleName patient's middle name
     * @param lastName patient's last name
     * @param address patient's street address
     * @param city patient's city
     * @param state patient's state
     * @param zip patient's ZIP code
     * @param phone patient's phone number
     * @param emergencyContactName name of emergency contact person
     * @param emergencyContactPhone phone number of emergency contact
     */
    public Patient(String firstName, String middleName, String lastName, 
                   String address, String city, String state,
                   String zip, String phone, 
                   String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // Accessors and mutators for all fields

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    /*
     * Builds the full name of the patient.
     * 
     * @return full name as "first middle last"
     */
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    /*
     * Builds the full address string for the patient.
     * 
     * @return formatted address string
     */
    public String buildAddress() {
        return address + ", " + city + ", " + state + " " + zip;
    }

    /*
     * Builds the emergency contact info string.
     * 
     * @return emergency contact name and phone concatenated
     */
    public String buildEmergencyContact() {
        return emergencyContactName + " " + emergencyContactPhone;
    }

    /*
     * Returns a string representation of the Patient details.
     */
    @Override
    public String toString() {
        return "Patient: " + buildFullName() + "\n" +
               "Address: " + buildAddress() + "\n" +
               "Emergency Contact: " + buildEmergencyContact();
    }
}
