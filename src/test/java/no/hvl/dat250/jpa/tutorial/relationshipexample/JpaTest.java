package no.hvl.dat250.jpa.tutorial.relationshipexample;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JpaTest {


    private static final String PERSISTENCE_UNIT_NAME = "jpa-turtorial";
    //definisjon av variabel med datatype og navn
    private EntityManagerFactory factory;

    @Before
    public void setUp(){
        //initialisera variabelen 'factory'
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        //definerer variabelen 'em' med datatypen Entitymanager
        //og initialiserer den
        EntityManager em = factory.createEntityManager();

        // Begin a new local transaction so that we can persist a new entity
        em.getTransaction().begin();

        //read the existing entries
        Query q = em.createQuery("select m from Person m");
        //persons should be empty

        boolean createNewEntries = (q.getResultList().size() == 0);
        //hvis createNewEntries er true så utføres det som er innenfor krøllparantesene
        if(createNewEntries){
            assertEquals(0, q.getResultList().size());
            Family family = new Family();
            family.setDescription("Family of the Varøy");
            em.persist(family);
            for(int i =0; i < 40; i++){
                Person person = new Person();
                person.setFirstName("Jim_" + i);
                person.setLastName("Knopf_" + i);
                person.setFamily(family);
                // now persists the family person relationship
                family.getMembers().add(person);
                em.persist(person);
                em.persist(family);
            }

        }
        em.getTransaction().commit();
        em.close();
    }
    @Test
    public void checkFamily() {
        EntityManager em = factory.createEntityManager();
        // Go through each of the entities and print out each of their
        // messages, as well as the date on which it was created
        Query q = em.createQuery("select f from Family f");

        // We should have one family with 40 persons
        assertEquals(1, q.getResultList().size());
        assertEquals(40, ((Family) q.getSingleResult()).getMembers().size());
        em.close();
    }

}
