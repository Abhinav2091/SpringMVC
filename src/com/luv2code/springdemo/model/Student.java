package com.luv2code.springdemo.model;

import java.util.HashMap;

public class Student {

	private String name;
	private int age;
	private String country;
	private HashMap<String, String> countryOptions;
	private String favouriteLanguage;
	private HashMap<String, String> FavouriteLanguagefromJava;
	private String[] OperatingSystem;

	public Student() {
		// populated country options
		countryOptions = new HashMap<>();
		countryOptions.put("BR", "BRAZIL");
		countryOptions.put("IN", "INDIA");
		countryOptions.put("USA", "USA");

		// populate favaurate language
		FavouriteLanguagefromJava = new HashMap<>();
		FavouriteLanguagefromJava.put("HN", "HINDI");
		FavouriteLanguagefromJava.put("EN", "ENGLISH");
		FavouriteLanguagefromJava.put("JAPAN", "JAPANIESE");
		FavouriteLanguagefromJava.put("NEPAL", "Nepali");
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", country=" + country + ", favouriteLanguage="
				+ favouriteLanguage + "]";
	}

	public HashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public HashMap<String, String> getFavouriteLanguagefromJava() {
		return FavouriteLanguagefromJava;
	}

	public String[] getOperatingSystem() {
		return OperatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		OperatingSystem = operatingSystem;
	}

}
