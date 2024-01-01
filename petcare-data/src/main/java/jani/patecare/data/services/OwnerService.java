package jani.patecare.data.services;

import jani.patecare.data.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
