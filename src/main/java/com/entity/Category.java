package com.entity;




import javax.persistence.Column;
import javax.persistence.Entity;

import javax.validation.constraints.NotBlank;



import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;






@Entity
@Table(name="categories")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false)
	private @NotBlank String name;

	
	public Category() {
	}



	

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}





	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}





	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}





	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}





	@Override
	public String toString() {
		return "User {category id=" + id + ", category name='" + name + "'}";
		}
		
	}


	
	




