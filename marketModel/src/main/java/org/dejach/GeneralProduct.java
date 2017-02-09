package org.dejach;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Table
@Entity
public class GeneralProduct {
@Column
private String generalProductName;
@OneToMany
private Collection<SpecificProduct> specificProducts = new ArrayList<SpecificProduct>();
@Column
private String branchId;
@Column
@Id
private String generalProductId;
@ManyToOne
private Branch branch;

public Branch getBranch() {
	return branch;
}
public void setBranch(Branch branch) {
	this.branch = branch;
}
public String getGeneralProductId() {
	return generalProductId;
}
public void setGeneralProductId(String generalProductId) {
	this.generalProductId = generalProductId;
}
public String getBranchId() {
	return branchId;
}
public void setBranchId(String branchId) {
	this.branchId = branchId;
}
public String getGeneralProductName() {
	return generalProductName;
}
public void setGeneralProductName(String generalProductName) {
	this.generalProductName = generalProductName;
}

public Collection<SpecificProduct> getSpecificProducts() {
	return specificProducts;
}
public void setSpecificProducts(Collection<SpecificProduct> specificProducts) {
	this.specificProducts = specificProducts;
}
}
