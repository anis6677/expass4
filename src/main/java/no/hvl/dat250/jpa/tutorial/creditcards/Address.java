package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.Collection;
import java.util.*;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private Integer number;

    @ManyToMany(mappedBy = "adresses")
    private List<Customer> customers;

    public Address(String street, Integer number) {
        this.street = street;
        this.number = number;
    }

    public Address() {

    }


    public String getStreet() {
        // TODO: implement method!
        return null;
    }

    public Integer getNumber() {
        // TODO: implement method!
        return null;
    }

    public Collection<Customer> getOwners() {
        // TODO: implement method!
        return null;
    }
}
