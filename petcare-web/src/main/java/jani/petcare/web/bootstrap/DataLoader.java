package jani.petcare.web.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jani.patecare.data.model.Owner;
import jani.patecare.data.model.Vet;
import jani.patecare.data.services.OwnerService;
import jani.patecare.data.services.VetService;
import jani.patecare.data.services.map.OwnerMapServiceImpl;
import jani.patecare.data.services.map.VetMapServiceImpl;

@Component
public class DataLoader implements CommandLineRunner {

    private static OwnerService ownerService;
    private static VetService vetService;

    public DataLoader() {
        ownerService = new OwnerMapServiceImpl();
        vetService = new VetMapServiceImpl();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michele");
        owner1.setLastName("john");
        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("John");
        owner2.setLastName("Doe");

        Owner owner3 = new Owner();
        owner3.setId(3L);
        owner3.setFirstName("Alice");
        owner3.setLastName("Smith");

        Owner owner4 = new Owner();
        owner4.setId(4L);
        owner4.setFirstName("Bob");
        owner4.setLastName("Johnson");

        Owner owner5 = new Owner();
        owner5.setId(5L);
        owner5.setFirstName("Emily");
        owner5.setLastName("Williams");

        ownerService.save(owner1);
        ownerService.save(owner2);
        ownerService.save(owner3);
        ownerService.save(owner4);
        ownerService.save(owner5);

        System.out.println("Owners Created");

        // vets

        Vet vet1 = new Vet();
        vet1.setId(7L);
        vet1.setFirstName("Sophia");
        vet1.setLastName("Miller");

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("John");
        vet2.setLastName("Doe");

        Vet vet3 = new Vet();
        vet3.setId(3L);
        vet3.setFirstName("Alice");
        vet3.setLastName("Smith");

        Vet vet4 = new Vet();
        vet4.setId(4L);
        vet4.setFirstName("Bob");
        vet4.setLastName("Johnson");

        Vet vet5 = new Vet();
        vet5.setId(5L);
        vet5.setFirstName("Emily");
        vet5.setLastName("Williams");

        System.out.println("Vets Created");

        vetService.save(vet1);
        vetService.save(vet2);
        vetService.save(vet3);
        vetService.save(vet4);
        vetService.save(vet5);
    }

}
