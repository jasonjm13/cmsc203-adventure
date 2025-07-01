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
   Print your Name here: Jason Martin
*/

public class Patient {
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

	public Patient() {
	}

	public Patient(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public Patient(String firstName, String middleName, String lastName, 
			String address, String city, String state,
			String zip, String phone, String emergencyContactName, 
			String emergencyContactPhone) {
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

	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName; }

	public String getMiddleName() { return middleName; }
	public void setMiddleName(String middleName) { this.middleName = middleName; }

	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName; }

	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }

	public String getCity() { return city; }
	public void setCity(String city) { this.city = city; }

	public String getState() { return state; }
	public void setState(String state) { this.state = state; }

	public String getZip() { return zip; }
	public void setZip(String zip) { this.zip = zip; }

	public String getPhone() { return phone; }
	public void setPhone(String phone) { this.phone = phone; }

	public String getEmergencyContactName() { return emergencyContactName; }
	public void setEmergencyContactName(String name) { this.emergencyContactName = name; }

	public String getEmergencyContactPhone() { return emergencyContactPhone; }
	public void setEmergencyContactPhone(String phone) { this.emergencyContactPhone = phone; }

	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}

	public String buildAddress() {
		return address + ", " + city + ", " + state + " " + zip;
	}

	public String buildEmergencyContact() {
		return emergencyContactName + " " + emergencyContactPhone;
	}

	public String toString() {
		return "Patient: " + buildFullName() + "\n" +
		       "Address: " + buildAddress() + "\n" +
		       "Emergency Contact: " + buildEmergencyContact();
	}
}
