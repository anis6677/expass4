package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pincode;
    private Integer count;

    @OneToMany()
    private List<CreditCard> creditCards;


    public Pincode(String pincode, Integer count) {
        this.pincode = pincode;
        this.count = count;
    }

    public Pincode() {

    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        // TODO: implement method!
        return null;
    }

    public Integer getCount() {
        // TODO: implement method!
        return null;
    }
}
