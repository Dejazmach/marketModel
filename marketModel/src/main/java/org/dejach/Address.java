package org.dejach;
import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class Address {  
@Column
private String countryName;
@Column
private String cityName;
@Column
private String mobilePhoneNo;
@Column
private String fixedLinePhoneNo;
@Column
private String email;
@Column
private String streetName;
@Column
private String houseNo;

public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
public String getMobilePhoneNo() {
	return mobilePhoneNo;
}
public void setMobilePhoneNo(String mobilePhoneNo) {
	this.mobilePhoneNo = mobilePhoneNo;
}
public String getFixedLinePhoneNo() {
	return fixedLinePhoneNo;
}
public void setFixedLinePhoneNo(String fixedLinePhoneNo) {
	this.fixedLinePhoneNo = fixedLinePhoneNo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public String getHouseNo() {
	return houseNo;
}
public void setHouseNo(String houseNo) {
	this.houseNo = houseNo;
}

}
