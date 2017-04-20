package uk.co.agilesphere.testapplication.domain;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @SequenceGenerator(name = "person_person_id_seq", sequenceName = "person_person_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_person_id_seq")
    @Column(name = "person_id", updatable = false)
    private Integer personId;
    private String username;
    private String password;
    private String email;

    public Person() {
    }

    public Person(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
