package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@MappedSuperclass
public abstract class Pessoa {

    @Id
    @Column(name = "id", length = 5)
    @NotNull
    private int id;

    @Column(name = "nome", length = 50)
    @NotNull
    private String nome;

    @Column(name = "telefone", length = 11)
    @NotNull
    private int telefone;

    @OneToOne
    @JoinColumn(name = "endereco")
    @NotNull
    private Endereco endereco;

}
