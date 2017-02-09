package org.dejach;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Administrator")
public class Administrator{
@Column
private String userName;
@Column
private String password;
@Column
private String firstName;
@Column
private String lastName;
@OneToMany
private Collection<Organization> organizations = new ArrayList<Organization>();
@OneToMany
private Collection<Branch> administeredBranches = new ArrayList<Branch>();
@Embedded
private Address administratorAddress;
@Column
private boolean status;
@Column
private String role;
@Column
@Id
@GeneratedValue
private String administratorId;


public Collection<Branch> getAdministeredBranches() {
	return administeredBranches;
}
public void setAdministeredBranches(Collection<Branch> administeredBranches) {
	this.administeredBranches = administeredBranches;
}
public String getAdministratorId() {
	return administratorId;
}
public void setAdministratorId(String administratorId) {
	this.administratorId = administratorId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
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
public Collection<Organization> getOrganizations() {
	return organizations;
}
public void setOrganizations(Collection<Organization> organizations) {
	this.organizations = organizations;
}
public Address getAdministratorAddress() {
	return administratorAddress;
}
public void setAdministratorAddress(Address administratorAddress) {
	this.administratorAddress = administratorAddress;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
}
