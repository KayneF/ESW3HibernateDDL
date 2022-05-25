package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "ficha")
public class Ficha {

    @Id
    @Column(name = "id_ficha", length = 10)
    @NotNull
    private int id;

    @Column(name = "cirurgias")
    @NotNull
    private String cirurgias;

    @Column(name = "medicamentos_adm")
    @NotNull
    private String medicamentosAdm;

    @Column(name = "alergias")
    @NotNull
    private String alergias;

    @Column(name = "historico_familiar")
    @NotNull
    private String historicoFam;

    @Column(name = "habitos")
    @NotNull
    private String habitos;

    @Column(name = "desenvolvimento")
    @NotNull
    private String desenvolvimento;

    // ---------------------------------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCirurgias() {
        return cirurgias;
    }

    public void setCirurgias(String cirurgias) {
        this.cirurgias = cirurgias;
    }

    public String getMedicamentosAdm() {
        return medicamentosAdm;
    }

    public void setMedicamentosAdm(String medicamentosAdm) {
        this.medicamentosAdm = medicamentosAdm;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getHistoricoFam() {
        return historicoFam;
    }

    public void setHistoricoFam(String historicoFam) {
        this.historicoFam = historicoFam;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    public String getDesenvolvimento() {
        return desenvolvimento;
    }

    public void setDesenvolvimento(String desenvolvimento) {
        this.desenvolvimento = desenvolvimento;
    }
}
