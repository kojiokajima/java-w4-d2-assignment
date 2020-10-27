
public class Instructor {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int yearOfExperience;
	
	public Instructor(String firstName, String lastName, String phoneNumber, int yearOfeExperience) {
		setFirstName(firstName);
		setLaatName(lastName);
		setPhoneNumber(phoneNumber);
		setYearOfExperience(yearOfeExperience);
	}
	
	public String getStatus(int yearOfExperience) {
		
		switch(yearOfExperience) {
		case 1:
			return "junior";
		case 2:
		case 3:
		case 4:
			return "intermediate";
		default:
			return "senior";
		}

	}
	
	
	// getters
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	
	// setters
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "Unknown";
		}
	}
	public void setLaatName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "Unknown";
		}
	}
	public void setPhoneNumber(String phoneNUmber) {
		if (!phoneNUmber.isEmpty() && !phoneNUmber.equalsIgnoreCase(null)) {
			this.phoneNumber = phoneNUmber;
		} else {
			this.phoneNumber = "Unknown";
		}
	}
	public void setYearOfExperience(int yearOfExperience) {
		if (yearOfExperience > 1) {
			this.yearOfExperience = yearOfExperience;
		}
	}
	
	
	
	
	
}
