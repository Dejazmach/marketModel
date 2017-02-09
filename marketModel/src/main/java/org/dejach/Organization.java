package org.dejach;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.util.ArrayList;
import java.util.Collection;
@Table
@Entity
public class Organization {
@Column
private String websiteUrl;
@OneToMany
private Collection<Owner> owners = new ArrayList<Owner>();
@Column
@Id
private String organizationId;
@Column
private String organizationMainName;
@Embedded
private CompanyAddress organizationMainAddress;
@Column
private String organizationInfo;
@ElementCollection
@GenericGenerator(name = "hilo-gen", strategy = "hilo")
@CollectionId(columns = { @Column (name="organizationSearchKeyId") }, generator = "hilo-gen", type = @Type(type = "long"))
private Collection<String> organizationSearchKeys = new ArrayList<String>();
@OneToMany
private Collection<Branch> branches = new ArrayList<Branch>();
@Column
private boolean status;
@ManyToOne
private Administrator administrator;
public Administrator getAdministrator() {
	return administrator;
}
public void setAdministrator(Administrator administrator) {
	this.administrator = administrator;
}
public Collection<Owner> getOwners() {
	return owners;
}
public void setOwners(Collection<Owner> owners) {
	this.owners = owners;
}
public Collection<Branch> getBranches() {
	return branches;
}
public void setBranches(Collection<Branch> branches) {
	this.branches = branches;
}
public String getWebsiteUrl() {
	return websiteUrl;
}
public void setWebsiteUrl(String websiteUrl) {
	this.websiteUrl = websiteUrl;
}
public String getOrganizationId() {
	return organizationId;
}
public void setOrganizationId(String organizationId) {
	this.organizationId = organizationId;
}
public String getOrganizationMainName() {
	return organizationMainName;
}
public void setOrganizationMainName(String organizationMainName) {
	this.organizationMainName = organizationMainName;
}

public CompanyAddress getOrganizationMainAddress() {
	return organizationMainAddress;
}
public void setOrganizationMainAddress(CompanyAddress organizationMainAddress) {
	this.organizationMainAddress = organizationMainAddress;
}
public String getOrganizationInfo() {
	return organizationInfo;
}
public void setOrganizationInfo(String organizationInfo) {
	this.organizationInfo = organizationInfo;
}
public Collection<String> getOrganizationSearchKeys() {
	return organizationSearchKeys;
}
public void setOrganizationSearchKeys(Collection<String> organizationSearchKeys) {
	this.organizationSearchKeys = organizationSearchKeys;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
}
