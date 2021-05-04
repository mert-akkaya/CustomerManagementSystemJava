package customerManagementSystem.entities;

import java.sql.Date;

import customerManagementSystem.abstracts.Entity;

public class Customer implements Entity{

	private int id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String nationalIndentity;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalIndentity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalIndentity = nationalIndentity;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getNationalIndentity() {
		return nationalIndentity;
	}


	public void setNationalIndentity(String nationalIndentity) {
		this.nationalIndentity = nationalIndentity;
	}
	
}
