/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author mateo
 */
@Entity
@Table(name = "TurnosMedicos")
public class Turno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Fecha")
    private Date fechaTurno;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_medico")
    private Medico medico;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_mascota")
    private Mascota mascota;

    @Column(name = "costo")
    private Double costo;

    // Constructor por defecto
    public Turno() {
    }

    // Constructor con parámetros
    public Turno(Date fechaTurno, double costo, Medico medico, Mascota mascota) {
        this.fechaTurno = fechaTurno;
        this.costo = costo;
        this.medico = medico;
        this.mascota = mascota;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public double getCosto() {
        return costo;
    }

    public Medico getMedico() {
        return medico;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Turno{"
                + "id=" + id
                + ", fechaTurno=" + fechaTurno
                + ", medicoId=" + (medico != null ? medico.getId() : null)
                + ", mascota=" + mascota
                + ", costo=" + costo
                + '}';
    }

    public void asignarMedico(Medico medico) {
        this.medico = medico;
        medico.agregarTurno(this); // Asegúrate de tener este método en Medico
    }
}
