package com.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class User {

    @Id
    @Column(name = "user_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long userId;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_name")
    private String phone;

    @JoinColumn(name = "contacts_id_fk")
    @OneToOne(targetEntity = )
    private  List<Contacts> contacts;
}
