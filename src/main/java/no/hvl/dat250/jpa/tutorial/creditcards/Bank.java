package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany()
    private List<CreditCard> creditCards;

    public Bank(String name) {
        this.name = name;
    }

    public Bank() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        // TODO: implement method!
        return null;
    }

    public Collection<CreditCard> getOwnedCards() {
        // TODO: implement method!

        return null;
    }
}
