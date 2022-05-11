package com.jpmc.model;

import java.util.Objects;

import lombok.Data;

/**
 * This Class is to store customer details.
 */
@Data
public class Customer {

	private String id;
	private String name;


	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Customer))
			return false;
		Customer customer = (Customer) o;
		return Objects.equals(name, customer.name) && Objects.equals(id, customer.id);
	}

	@Override
	public String toString() {
		return "name: " + name;
	}
}