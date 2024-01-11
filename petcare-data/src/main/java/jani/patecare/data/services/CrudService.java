package jani.patecare.data.services;

import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public interface CrudService<T, ID> {
    public Set<T> findall();

    public T findById(ID id);

    public T save(T object);

    public void delete(T object);
}
