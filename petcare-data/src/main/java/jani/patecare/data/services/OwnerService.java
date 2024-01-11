package jani.patecare.data.services;

import org.springframework.stereotype.Service;

import jani.patecare.data.model.Owner;

@Service
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
