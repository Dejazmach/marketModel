package org.dejach;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Table
@Entity
public class Owner {
@Column
private String ownerName;
@Embedded
private Address ownerAddress;
@Column
@Id
private String ownerId;
@ManyToOne
private Organization organization;

public String getOwnerId() {
	return ownerId;
}
public void setOwnerId(String ownerId) {
	this.ownerId = ownerId;
}
public Organization getOrganization() {
	return organization;
}
public void setOrganization(Organization organization) {
	this.organization = organization;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public Address getOwnerAddress() {
	return ownerAddress;
}
public void setOwnerAddress(Address ownerAddress) {
	this.ownerAddress = ownerAddress;
}
}
