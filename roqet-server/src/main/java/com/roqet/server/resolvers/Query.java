package com.roqet.server.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.roqet.server.entities.Pet;
import com.roqet.server.repositories.PetRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

	@Autowired
	private PetRepository petRepository;

	public Iterable<Pet> pets() {
		return petRepository.findAll();
	}
}
