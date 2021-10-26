package br.com.mps.exemplo.model;

import javax.persistence.*;

@Entity
public class Credenciais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credenciais_id")
    private Long id;

    private String username;

    private String password;


}
