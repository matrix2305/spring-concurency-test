package nl.amis.smeetsm;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.*;

@Table("person")
public class Person {

    @Id
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}