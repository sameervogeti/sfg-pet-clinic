package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet save(Pet pet);
    Pet findById(long id);
    Set<Pet> findAll();
}
