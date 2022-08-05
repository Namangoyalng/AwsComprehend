package com.AwsComprehend.AwsComprehend.Entities;

public class Entity {
	private String Text;
	private String LanguageCode;
	
	public Entity(String text, String languageCode) {
		super();
		this.Text = text;
		this.LanguageCode = languageCode;
		
	}
	public Entity() {
		super();
		
	}
	public String getText() {
		return Text;
	}
	public void setText(String text) {
		this.Text = text;
	}
	public String getLanguageCode() {
		return LanguageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.LanguageCode = languageCode;
	}
	
	@Override
	public String toString() {
		return "Entity [Text=" + Text + ", LanguageCode=" + LanguageCode + "]";

}
}
