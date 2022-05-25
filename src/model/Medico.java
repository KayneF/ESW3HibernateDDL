package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "medico")
public class Medico extends Pessoa {

    @Column(name = "especialidade", length = 30)
    @NotNull
    private Especialidade especialidade;

    // --------------------------------------------------------

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
}
