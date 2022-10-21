package Entity;

public class Address {
	private String city;
	private String state;
	private String street;
	private int zipCode;

	public Address() {
		super();
	}

	public Address(String city, String state, String street, int zipCode) {
		super();
		this.city = city;
		this.state = state;
		this.street = street;
		this.zipCode = zipCode;
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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

}
