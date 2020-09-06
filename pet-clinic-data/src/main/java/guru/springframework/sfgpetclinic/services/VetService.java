package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet save(Vet vet);
    Vet findById(long id);
    Set<Vet> findAll();

}
