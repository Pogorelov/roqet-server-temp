package com.roqet.server.repositories;

import org.springframework.data.repository.CrudRepository;

import com.roqet.server.entities.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {}
