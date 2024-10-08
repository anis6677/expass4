// The way I worked 
was to create new dataSources from DB.mv.db and should use or convert h2 database.

Experiment 1: Preparation and optional tutorial

**I complete tutorial with an overview and a gentle introduction to JPA. 
The goal is to set up a Java application that uses JPA for storing entities in a database.**

Setup:
In this project  I using gradle and run.
Run the class Main. 
Used to JPA and understand the project setup.

The technical problems whit installation Java Persistence Architecture (JPA)  i resolved like task said in (https://github.com/webminz/dat250-jpa-tutorial/blob/master/README.md) 
I have problems when I using incompatible versions of Java, JPA, database driver.
Then solution was ensure that the versions of JPA, Java, and the database driver are compatible. I check for updates and downgrades to resolve version conflicts.

I du simple test case to test basic CRUD operations using JPA
Skjermbilde 2024-10-07 105222.png -pic.nr 1 
(https://github.com/user-attachments/assets/eee6cbeb-bb69-4990-b3ab-3ab49f5fd81c)

**The screenshots doing under the task pic 2,3 into exp. 2
 
Experiment 2: Banking/Credit Card example JPA was more dificult spesial
Implement the domain model for credit cards similar to the Person-Address-Examples like (object-relational mappings) and associations in the domain model.
relationships between entities (like @OneToMany, @ManyToOne, etc.)
was not soo easy --- [Skjermbilde 2024-10-07 105222 expass 4 test Anita ](https://github.com/user-attachments/assets/0a0bcb17-3100-4bae-b309-1fba829cde95)



In lecture 9 in DAT250 i used Persisting an Entity
Persisting an entity means inserting data into the database when the data don’t already exist (otherwise an
EntityExistsException is thrown).


To do so, it’s necessary to create a new entity instance using the new operator,
set the values of the attributes, bind one entity to another when there are associations, and finally call the
EntityManager.persist() method as shown in the JUnit test case in Listing 6-7.
Listing 6-7. Persisting a Customer with an Address
Customer customer = new Customer("Antony", "Balla", "tballa@mail.com");
Address address = new Address("Ritherdon Rd", "London", "8QE", "UK");
customer.setAddress(address);
tx.begin();
em.persist(customer);
em.persist(address);
tx.commit();
assertNotNull(customer.getId());
assertNotNull(address.getId()); to create customer or address etc. 

_ _(https://github.com/user-attachments/assets/18cb50a8-526a-4e85-afea-0f2654e0231f)_ _

_ _(https://github.com/user-attachments/assets/a69b0718-5d64-4948-8479-64240f065424)_ _

**CreditCardsMAin Test runs successfully!**     ![Skjermbilde 2024-10-07 105222 expass 4 test Anita ](https://github.com/user-attachments/assets/43c6c486-65ea-4f34-9bb6-580296d57222)
                                                 ![Skjermbilde 2024-10-07 105935 expass 4 main java Anita](https://github.com/user-attachments/assets/072f6037-3023-4b8c-b7a2-b99981008617)
                        ![Skjermbilde 2024-09-27 144259](https://github.com/user-attachments/assets/3bebb31c-f82a-45dc-95cc-218ce735fa5a)


**My Explain the used database in eksper.1  The database used in a given system might vary depending on the exercise. 
a relational database like MySQL or PostgreSQL**
For more permanent databases (like MySQL), they are hosted on a server and run continuously. In my projects, ORM (Object Relational Mapping) configurations create and set up the database tables automatically.


For H2 in-memory databases, I ccess the web console (localhost:8080/h2-console) to visually inspect the tables and I generate a schema diagram. 
I also provide the SQL used to create the table Customer? 

_ _(https://github.com/user-attachments/assets/35049231-6222-4159-8b12-67f20d03c409)_ _




