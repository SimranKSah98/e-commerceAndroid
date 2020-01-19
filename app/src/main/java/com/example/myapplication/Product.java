package com.example.myapplication;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Product{

	@SerializedName("products")
	private List<ProductsItem> products;

	public void setProducts(List<ProductsItem> products){
		this.products = products;
	}

	public List<ProductsItem> getProducts(){
		return products;
	}

	@Override
 	public String toString(){
		return 
			"Product{" + 
			"products = '" + products + '\'' + 
			"}";
		}
}