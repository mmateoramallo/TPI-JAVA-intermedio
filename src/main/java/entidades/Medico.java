/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author mateo
 */
@Entity
@Table(name = "medicos")
public class Medico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "Matricula")
    private String matricula;

    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Turno> turnos;

    // Constructor por defecto
    public Medico() {
        this.turnos = new ArrayList<>();
    }

    // Constructor con parámetros
    public Medico(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.turnos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    @Override
    public String toString() {
        return "Medico{"
                + "id=" + id
                + ", nombre='" + nombre + '\''
                + ", matricula='" + matricula + '\''
                + ", turnos=["
                + turnos.stream().map(Turno::toString).collect(Collectors.joining(", "))
                + "]}";
    }

    public void agregarTurno(Turno turno) {
        this.turnos.add(turno);
    }

}
