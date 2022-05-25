package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Table(name = "paciente")
public class Paciente extends Pessoa {

    @UniqueElements
    @Column(name = "beneficiario", length = 10)
    @NotNull
    private int beneficiario;

    // --------------------------------------------------------

    public int getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(int beneficiario) {
        this.beneficiario = beneficiario;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "beneficiario=" + beneficiario +
                '}';
    }
}
