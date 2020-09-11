package guru.springframework.sfgpetclinic.map;

import guru.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {
    protected Map<Long,T> map=new HashMap<>();

    Set<T> findAll()
    {
        return new HashSet<>(map.values());
    }

    T findById(ID ID)
    {
        return map.get(ID);
    }

    T save(T object)
    {
        if(object!=null)
        {
            if(object.getId()==null)
            {
                object.setId(getnxtId());
            }
        }
        map.put(object.getId(),object);
        return object;
    }
    void deleteById(ID id)
    {
        map.remove(id);
    }
    void delete(T object)
    {
        map.entrySet().removeIf(entry->entry.getValue().equals(object));
    }
    private Long getnxtId()
    {
        Long nextId=null;
        try
        {
            nextId=Collections.max(map.keySet()) + 1;
        }
        catch(NoSuchElementException e)
        {
            nextId=1L;
        }
        return nextId;
    }
}
