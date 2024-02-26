/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Assignment 1
 * Description: Create Patient Class that includes Patient info, Procedure Class that represents a medical procedure done, and PatientDriverApp Class that creates an instance of the Patient Class initialized with sample data.
 * Due:02/26/24
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Darina Diaz
*/

package main;
public class Patient {
	private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String emergencyContactName;
    private String emergencyContactPhone;

    public Patient() {
    }

    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    public Patient(String firstName, String middleName, String lastName, String streetAddress,
                   String city, String state, String zip, String phoneNumber,
                   String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

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

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    // Method to build full name
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    // Method to build address
    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zip;
    }

    // Method to build emergency contact
    public String buildEmergencyContact() {
        return emergencyContactName + " " + emergencyContactPhone;
    }

    public String toString() {
        // Create the patient information with indentation
        String patientInfo = "Patient Info:\n";
        patientInfo += "    Name: " + buildFullName() + "\n";
        patientInfo += "    Address: " + buildAddress() + "\n";
        patientInfo += "    Phone Number: " + phoneNumber + "\n";
        patientInfo += "    Emergency Contact: " + buildEmergencyContact();
        return patientInfo;
    }
}