package com.roqet.server.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.roqet.server.enums.Animal;

import lombok.Data;

@Data
@Entity
@Table(name="pets")
public class Pet {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;

	private String name;

	@Enumerated(EnumType.STRING)
	private Animal type;

	private int age;

	public long getId() {
		return id;
	}

	public Pet setId(long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Pet setName(String name) {
		this.name = name;
		return this;
	}

	public Animal getType() {
		return type;
	}

	public Pet setType(Animal type) {
		this.type = type;
		return this;
	}

	public int getAge() {
		return age;
	}

	public Pet setAge(int age) {
		this.age = age;
		return this;
	}
}
