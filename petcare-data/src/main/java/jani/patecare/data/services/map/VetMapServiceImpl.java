package jani.patecare.data.services.map;

import java.util.Set;

import jani.patecare.data.model.Vet;
import jani.patecare.data.services.CrudService;

public class VetMapServiceImpl extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Vet> findall() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object, object.getId());
    }

}
