package entities;

public class Customer {
	private int id;
	private int dateOfBirth;
	private String firstName, lastName;
	private String nationality;
	
	public Customer(int id, int dateOfBirth, String firstName, String lastName, String nationality) {
		this.id = id;
		this.dateOfBirth = dateOfBirth;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationality = nationality;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	

}
