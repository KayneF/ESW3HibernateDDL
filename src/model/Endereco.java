package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "endereco_paciente")
public class Endereco {

    @Id
    @Column(name = "endereco_id")
    @NotNull
    private int id;

    @Column(name = "logradouro", length = 50)
    @NotNull
    private String logradouro;

    @Column(name = "numero", length = 6)
    @NotNull
    private int numero;

    @Column(name = "cep", length = 8)
    @NotNull
    private int cep;

    @Column(name = "complemento", length = 20)
    @NotNull
    private String complemento;

    @Column(name = "cidade", length = 30)
    @NotNull
    private String cidade;

    @Column(name = "uf", length = 2)
    @NotNull
    private UF uf;

    // -------------------------------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }
}
