package com.freelancing.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String firstName;

	private String lastName;

	private String shopName; // for tech expert

	private String emailId;

	@JsonIgnore
	private String password;

	private String phoneNo;

	private String role;

	@OneToOne
	@JoinColumn(name = "address_id")
	private Address address;

	private BigDecimal walletAmount;

	private String status;

}
