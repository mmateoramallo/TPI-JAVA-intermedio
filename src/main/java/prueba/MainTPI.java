/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import DAO.MedicoDAO;
import DAO.TurnoDAO;
import GUI.InicioSesionGUI;
import entidades.Gato;
import entidades.Medico;
import entidades.Turno;
import java.util.Date;
import repository.MedicoRepository;
import repository.TurnoRepository;



/**
 *
 * @author mateo
 */
public class MainTPI {

    public static void main(String[] args) {
        //InicioSesionGUI inicioSesionGUI = new InicioSesionGUI();
        
        Medico medicoUno = new Medico("Luz", "51223");
        
        MedicoDAO mdao = new MedicoRepository();
        
        mdao.guardar(medicoUno);
        
        Gato gatoUno = new Gato("Gala", "53123", 12, "Blanco");
        
        Date fechaActual = new Date();
        
        Turno turnoUno = new Turno(fechaActual, 100.40, medicoUno, gatoUno);
        
        TurnoDAO tdao = new TurnoRepository();
        
        //mdao.guardar(medicoUno); -> En este momento el codigo funciona correctamente sin haber creado todavia la logica de los Turnos
        tdao.guardar(turnoUno);
        
    }
}
