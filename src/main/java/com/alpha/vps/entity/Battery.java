package com.alpha.vps.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Power Station")
public class Battery {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="battery_name",nullable=false)
    private String name;
	@Column(name="Post_code",nullable=false)
    private String postcode;
	@Column(name="watt_capacity",nullable=false)
    private int wattCapacity;
    
	public Battery() {
		
	}

	public Battery(Long id, String name, String postcode, int wattCapacity) {
		super();
		this.id = id;
		this.name = name;
		this.postcode = postcode;
		this.wattCapacity = wattCapacity;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
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

	/**
	 * @return the postcode
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * @param postcode the postcode to set
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	/**
	 * @return the wattCapacity
	 */
	public int getWattCapacity() {
		return wattCapacity;
	}

	/**
	 * @param wattCapacity the wattCapacity to set
	 */
	public void setWattCapacity(int wattCapacity) {
		this.wattCapacity = wattCapacity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, postcode, wattCapacity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Battery other = (Battery) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(postcode, other.postcode) && wattCapacity == other.wattCapacity;
	}

	@Override
	public String toString() {
		return "Battery [id=" + id + ", name=" + name + ", postcode=" + postcode + ", wattCapacity=" + wattCapacity
				+ "]";
	}

	
}