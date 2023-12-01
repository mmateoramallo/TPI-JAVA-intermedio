/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import entidades.Turno;
import java.util.List;

/**
 *
 * @author mateo
 */
public interface TurnoDAO {

    Turno obtenerPorId(int id);

    List<Turno> obtenerTodos();

    void guardar(Turno turno);

    void actualizar(Turno turno);

    void eliminar(int id);
}
