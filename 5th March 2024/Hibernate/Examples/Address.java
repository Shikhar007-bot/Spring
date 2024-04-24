package com.example.orm;

import javax.persistence.*;

@Entity
//@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;



    @Override
    public String toString() {
        return "Address [id=" + id + ", street=" + street + ", city=" + city + "]";
    }
}
