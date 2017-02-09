package org.dejach;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import java.util.ArrayList;
import java.util.List;
@Table
@Entity
public class SpecificProduct {
@Column
private String specificProductName;
@Embedded
private SpecificProductPrice specificProductPrice;
@Column
private String specificProductManufacturerName;
@Column
private String specificProductModel;
@Column
private boolean specificProductAvailablity;
@Column
private String specificProductDisplayPictureUrl;
@ElementCollection
@GenericGenerator(name = "hilo-gen", strategy = "hilo")
@CollectionId(columns = { @Column (name="specificProductPicturesUrlId") }, generator = "hilo-gen", type = @Type(type = "long"))

private List<String> specificProductPicturesUrls = new ArrayList<String>();
@Column
private String specifcProductDescription;
@Column
@Id
private String specificProductId;
@ManyToOne
private GeneralProduct generalProduct;


public GeneralProduct getGeneralProduct() {
	return generalProduct;
}
public void setGeneralProduct(GeneralProduct generalProduct) {
	this.generalProduct = generalProduct;
}
public String getSpecificProductId() {
	return specificProductId;
}
public void setSpecificProductId(String specificProductId) {
	this.specificProductId = specificProductId;
}
public String getSpecifcProductDescription() {
	return specifcProductDescription;
}
public void setSpecifcProductDescription(String specifcProductDescription) {
	this.specifcProductDescription = specifcProductDescription;
}
public String getSpecificProductName() {
	return specificProductName;
}
public void setSpecificProductName(String specificProductName) {
	this.specificProductName = specificProductName;
}
public SpecificProductPrice getSpecificProductPrice() {
	return specificProductPrice;
}
public void setSpecificProductPrice(SpecificProductPrice specificProductPrice) {
	this.specificProductPrice = specificProductPrice;
}
public String getSpecificProductManufacturerName() {
	return specificProductManufacturerName;
}
public void setSpecificProductManufacturerName(
		String specificProductManufacturerName) {
	this.specificProductManufacturerName = specificProductManufacturerName;
}
public String getSpecificProductModel() {
	return specificProductModel;
}
public void setSpecificProductModel(String specificProductModel) {
	this.specificProductModel = specificProductModel;
}
public boolean isSpecificProductAvailablity() {
	return specificProductAvailablity;
}
public void setSpecificProductAvailablity(boolean specificProductAvailablity) {
	this.specificProductAvailablity = specificProductAvailablity;
}
public String getSpecificProductDisplayPictureUrl() {
	return specificProductDisplayPictureUrl;
}
public void setSpecificProductDisplayPictureUrl(
		String specificProductDisplayPictureUrl) {
	this.specificProductDisplayPictureUrl = specificProductDisplayPictureUrl;
}
public List<String> getSpecificProductPicturesUrls() {
	return specificProductPicturesUrls;
}
public void setSpecificProductPicturesUrls(
		List<String> specificProductPicturesUrls) {
	this.specificProductPicturesUrls = specificProductPicturesUrls;
}

}
