package jani.patecare.data.services.map;

import java.util.Set;

import jani.patecare.data.model.Owner;
import jani.patecare.data.services.CrudService;
import jani.patecare.data.services.OwnerService;

public class OwnerMapServiceImpl extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findall() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object, object.getId());
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByLastName'");
    }
}
