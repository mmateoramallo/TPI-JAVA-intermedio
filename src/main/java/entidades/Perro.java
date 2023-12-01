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
@Table(name  = "perros")
public class Perro extends Mascota implements Serializable{
        private String raza;
        
    public Perro() {
    }
        
    // Constructor para Perro
    public Perro(String nombre, String legajo, Integer edad, String raza) {
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
        return "Perro { " +
                "nombre='" + getNombre() + '\'' +
                ", legajo='" + getLegajo() + '\'' +
                ", edad=" + getEdad() +
                ", raza='" + raza + '\'' +
                " }";
    }
}