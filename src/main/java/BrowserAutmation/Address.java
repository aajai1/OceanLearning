package BrowserAutmation;

public class Address {
	
	private int doorNo;
	private String locality;
	private String city;
	
	public  Address(int DoorNo,String Locality,String City) {
		this.doorNo=DoorNo;
		this.locality=Locality;
		this.city=City;
		
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", locality=" + locality + ", city=" + city + "]";
	}
	

	
}
