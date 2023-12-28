package rest.model;

import javax.persistence.*;

@Entity
@Table(name = "crud_users", uniqueConstraints = @UniqueConstraint(columnNames = "login"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login", length = 50)
    private String login;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age", length = 3)
    private Integer age;

    public User() {
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
