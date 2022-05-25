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

    // --------------------------------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone=" + telefone +
                ", endereco=" + endereco +
                '}';
    }
}
