package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;
    private Integer creditLimit;
    private Integer balance;

    @ManyToMany(mappedBy = "creditCards")
    private List<Customer> customers;

    @ManyToOne()
    private Bank bank;

    @ManyToOne()
    private Pincode pincode;

    public CreditCard(Integer number, Integer creditLimit, Integer balance) {
        this.number = number;
        this.creditLimit = creditLimit;
        this.balance = balance;
    }

    public CreditCard() {

    }

    public Integer getNumber() {
        // TODO: implement method!
        return null;
    }

    public Integer getBalance() {
        // TODO: implement method!
        return null;
    }

    public Integer getCreditLimit() {
        // TODO: implement method!
        return null;
    }

    public Pincode getPincode() {
        // TODO: implement method!
        return null;
    }

    public Bank getOwningBank() {
        // TODO: implement method!
        return null;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
    public void setPincode(Pincode pincode) {
        this.pincode = pincode;
    }
}
