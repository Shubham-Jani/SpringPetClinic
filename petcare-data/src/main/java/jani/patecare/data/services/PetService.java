package jani.patecare.data.services;

import java.util.Set;

import jani.patecare.data.model.Pet;

public interface PetService {
    Pet findById(long id);

    Pet save(Pet pet);

    Set<Pet> findall();
}
