package jani.petcare.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "jani.petcare", "jani.patecare" })
public class SfgPetClinicApplication {
    public static void main(String[] args) {
        SpringApplication.run(SfgPetClinicApplication.class, args);
    }
}
