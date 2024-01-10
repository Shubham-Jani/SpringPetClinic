package jani.patecare.data.services.map;

import java.util.Set;

import jani.patecare.data.model.Pet;
import jani.patecare.data.services.PetService;

public class PetMapServiceImpl extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Pet> findall() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object, object.getId());
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

}
