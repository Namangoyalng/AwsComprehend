package com.AwsComprehend.AwsComprehend.Entities;

import java.util.ArrayList;
import java.util.List;


public class KeyModal {

	private List<KeyDataModal> oraganization = new ArrayList<>();
	private List<KeyDataModal> person = new ArrayList<>();
	private List<KeyDataModal> other= new ArrayList<>();
	private List<KeyDataModal> commercialItem= new ArrayList<>();
	private List<KeyDataModal> date = new ArrayList<>();
	private List<KeyDataModal> event = new ArrayList<>();
	private List<KeyDataModal> location = new ArrayList<>();
	private List<KeyDataModal> quantity = new ArrayList<>();
	private List<KeyDataModal> title = new ArrayList<>();
	private List<KeyDataModal> keyphrase = new ArrayList<>();
	
	
	public List<KeyDataModal> getOraganization() {
		return oraganization;
	}
	public void setOraganization(List<KeyDataModal> oraganization) {
		this.oraganization = oraganization;
	}
	public List<KeyDataModal> getPerson() {
		return person;
	}
	public void setPerson(List<KeyDataModal> person) {
		this.person = person;
	}
	public List<KeyDataModal> getOther() {
		return other;
	}
	public void setOther(List<KeyDataModal> other) {
		this.other = other;
	}
	public List<KeyDataModal> getCommercialItem() {
		return commercialItem;
	}
	public void setCommercialItem(List<KeyDataModal> commercialItem) {
		this.commercialItem = commercialItem;
	}
	public List<KeyDataModal> getDate() {
		return date;
	}
	public void setDate(List<KeyDataModal> date) {
		this.date = date;
	}
	public List<KeyDataModal> getEvent() {
		return event;
	}
	public void setEvent(List<KeyDataModal> event) {
		this.event = event;
	}
	public List<KeyDataModal> getLocation() {
		return location;
	}
	public void setLocation(List<KeyDataModal> location) {
		this.location = location;
	}
	public List<KeyDataModal> getQuantity() {
		return quantity;
	}
	public void setQuantity(List<KeyDataModal> quantity) {
		this.quantity = quantity;
	}
	public List<KeyDataModal> getTitle() {
		return title;
	}
	public void setTitle(List<KeyDataModal> title) {
		this.title = title;
	}
	public List<KeyDataModal> getKeyphrase() {
		return keyphrase;
	}
	public void setKeyphrase(List<KeyDataModal> keyphrase) {
		this.keyphrase = keyphrase;
	}
	
	
	
}
