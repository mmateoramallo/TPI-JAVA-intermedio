/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author mateo
 */
@Entity
@Table(name  = "gatos")
public class Gato extends Mascota implements Serializable {
    private String raza;

    public Gato() {
    }
    
    // Constructor para Gato
    public Gato(String nombre, String legajo, Integer edad, String raza) {
        setNombre(nombre);
        setLegajo(legajo);
        setEdad(edad);
        setRaza(raza);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

        @Override
    public String toString() {
        return "Gato { " +
                "nombre='" + getNombre() + '\'' +
                ", legajo='" + getLegajo() + '\'' +
                ", edad=" + getEdad() +
                ", raza='" + raza + '\'' +
                " }";
    }
}