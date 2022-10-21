package Entity;

import java.util.Date;

import org.bson.codecs.pojo.annotations.BsonId;

public class Customer {
	private String customerID;
	private String fistName;
	private String lastName;
	private String email;
	private Date registrationDate;
	private Phone phone;
	private Address address;

	public Customer() {
	}

	public Customer(String customerID) {
		this.customerID = customerID;
	}

	public Customer(String customerID, String fistName, String lastName, String email, Date registrationDate) {
		this.customerID = customerID;
		this.fistName = fistName;
		this.lastName = lastName;
		this.email = email;
		this.registrationDate = registrationDate;
	}

	public Customer(String customerID, String fistName, String lastName, String email, Date registrationDate,
			Phone phone, Address address) {
		super();
		this.customerID = customerID;
		this.fistName = fistName;
		this.lastName = lastName;
		this.email = email;
		this.registrationDate = registrationDate;
		this.phone = phone;
		this.address = address;
	}

	public Customer(String customerID, String fistName, String lastName, String email, Date registrationDate,
			Address address) {
		super();
		this.customerID = customerID;
		this.fistName = fistName;
		this.lastName = lastName;
		this.email = email;
		this.registrationDate = registrationDate;
		this.address = address;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

}
