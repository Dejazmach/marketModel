package org.dejach;
import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class SpecificProductPrice {
@Column
private double price;
private Unit unit;
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Unit getUnit() {
	return unit;
}
public void setUnit(Unit unit) {
	this.unit = unit;
}

}
