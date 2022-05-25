package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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

    @Override
    public String toString() {
        return "Medico{" +
                "especialidade=" + especialidade +
                '}';
    }
}
