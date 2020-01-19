package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

public class ProductsItem{

	@SerializedName("image")
	private String image;

	@SerializedName("price")
	private double price;

	@SerializedName("mechartName")
	private String mechartName;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;
	}

	public void setMechartName(String mechartName){
		this.mechartName = mechartName;
	}

	public String getMechartName(){
		return mechartName;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"ProductsItem{" + 
			"image = '" + image + '\'' + 
			",price = '" + price + '\'' + 
			",mechartName = '" + mechartName + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}