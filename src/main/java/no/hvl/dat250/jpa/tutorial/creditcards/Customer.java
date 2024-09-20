package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.Collection;
import java.util.List;

import jakarta.persistence.*;

import javax.xml.namespace.QName;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany()
    @JoinTable(
            name = "customer_adresses",
            joinColumns = @JoinColumn(name= "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id")
    )
    private List<Address> adresses;


    @ManyToMany()
    @JoinTable(
            name = "customer_creditcard",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "creditcard_id")
    )
    private List<CreditCard> creditCards;

    public Customer(String name){
        this.name = name;
    }

    public Customer() {

    }


    public String getName() {
        // TODO: implement method!
        return null;
    }

    public Collection<Address> getAddresses() {
        // TODO: implement method!
        return null;
    }

    public Collection<CreditCard> getCreditCards() {
        // TODO: implement method!
        return null;
    }
}
