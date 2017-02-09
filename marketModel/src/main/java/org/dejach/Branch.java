package org.dejach;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Branch {
@Column
private String branchName;
@Embedded
private CompanyAddress branchAddress;
@OneToMany
private Collection<GeneralProduct> generalProducts = new ArrayList<GeneralProduct>();
@Id
private String branchId;
@ManyToOne
private Organization organization;
@ManyToOne
private Administrator administrator;

public Administrator getAdministrator() {
	return administrator;
}
public void setAdministrator(Administrator administrator) {
	this.administrator = administrator;
}


public Organization getOrganization() {
	return organization;
}
public void setOrganization(Organization organization) {
	this.organization = organization;
}
public String getBranchId() {
	return branchId;
}
public void setBranchId(String branchId) {
	this.branchId = branchId;
}
public Collection<GeneralProduct> getGeneralProducts() {
	return generalProducts;
}
public void setGeneralProducts(Collection<GeneralProduct> generalProducts) {
	this.generalProducts = generalProducts;
}
public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}
public CompanyAddress getBranchAddress() {
	return branchAddress;
}
public void setBranchAddress(CompanyAddress branchAddress) {
	this.branchAddress = branchAddress;
}
}
