package org.dejach;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
@Embeddable
public class CompanyAddress{
	@Column
	private String countryName;
	@Column
	private String cityName;
	@Column
	private String mobilePhoneNo;
	@Column
	private String fixedLinePhoneNo;
	@ElementCollection
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@CollectionId(columns = { @Column (name="email") }, generator = "hilo-gen", type = @Type(type = "long"))
	private Collection<String> emails = new ArrayList<String>();
	@Column
	private String streetName;
	@Column
	private String houseNo;
	@Column
	private double lat;
	@Column
	private double lng;
	public Collection<String> getEmails() {
		return emails;
	}
	public void setEmails(Collection<String> emails) {
		this.emails = emails;
	}
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
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
}
