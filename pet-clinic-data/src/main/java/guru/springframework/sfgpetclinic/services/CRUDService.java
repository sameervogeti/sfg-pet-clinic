package guru.springframework.sfgpetclinic.services;


import java.util.Set;

public interface CRUDService<T,id> {
    T save(T object);
    T findById(Long id);
    Set<T> findAll();
    void delete(T object);
}
