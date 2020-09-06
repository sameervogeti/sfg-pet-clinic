package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner save(Owner owner);
    Owner findById(long id);
    Set<Owner> findAll();
    Owner findByLastName(String lastName);
}
