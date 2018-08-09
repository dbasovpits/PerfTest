package pits.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table
@Data
public class User {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String address;

}
