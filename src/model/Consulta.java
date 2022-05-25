package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Entity
@Table(name = "consulta")
public class Consulta {

    @Id
    @Column(name = "data_consulta")
    @NotNull
    private LocalDateTime dataConsulta;

    @Id
    @ManyToOne
    @JoinColumn(name = "consulta_paciente")
    @NotNull
    private Paciente consultaPaciente;

    @Id
    @ManyToOne
    @JoinColumn(name = "consulta_medico")
    @NotNull
    private Medico consultaMedico;

    @Id
    @ManyToOne
    @JoinColumn(name = "ficha_paciente")
    @NotNull
    private Ficha fichaPaciente;

    // -----------------------------------------------

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Paciente getConsultaPaciente() {
        return consultaPaciente;
    }

    public void setConsultaPaciente(Paciente consultaPaciente) {
        this.consultaPaciente = consultaPaciente;
    }

    public Medico getConsultaMedico() {
        return consultaMedico;
    }

    public void setConsultaMedico(Medico consultaMedico) {
        this.consultaMedico = consultaMedico;
    }

    public Ficha getFichaPaciente() {
        return fichaPaciente;
    }

    public void setFichaPaciente(Ficha fichaPaciente) {
        this.fichaPaciente = fichaPaciente;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "dataConsulta=" + dataConsulta +
                ", consultaPaciente=" + consultaPaciente +
                ", consultaMedico=" + consultaMedico +
                ", fichaPaciente=" + fichaPaciente +
                '}';
    }
}
