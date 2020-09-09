package guru.springframework.sfgpetclinic.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.CRUDService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CRUDService<Vet,Long>
{
    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
    @Override
    public void deleteById(Long id)
    {
        super.deleteById(id);
    }
}