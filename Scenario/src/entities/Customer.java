package entities;

import java.time.LocalDate;

import abstracts.Entity;

public class Customer implements Entity {
	private int id;
	private LocalDate dateOfBirth;
	private String firstName, lastName;
	private String nationality;
	
	public Customer() {
		
	}
	
	public Customer(int id,LocalDate dateOfBirth, String firstName, String lastName, String nationality) {
		this.id=id;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
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
