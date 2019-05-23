package com.jerseydemo.JerseyDemo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
private int cusId;
private String cusName;
private String cusCity;
public int getCusId() {
	return cusId;
}
public void setCusId(int cusId) {
	this.cusId = cusId;
}
public String getCusName() {
	return cusName;
}
public void setCusName(String cusName) {
	this.cusName = cusName;
}
public String getCusCity() {
	return cusCity;
}
public void setCusCity(String cusCity) {
	this.cusCity = cusCity;
}

}
