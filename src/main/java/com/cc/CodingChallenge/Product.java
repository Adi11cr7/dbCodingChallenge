package com.cc.CodingChallenge;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	@Id 
	public String objID;
	public String name;

}
