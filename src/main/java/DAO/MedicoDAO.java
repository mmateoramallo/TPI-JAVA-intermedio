/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import entidades.Medico;
import java.util.List;

/**
 *
 * @author mateo
 */
public interface MedicoDAO {

    Medico obtenerPorId(int id);

    List<Medico> obtenerTodos();

    void guardar(Medico medico);

    void actualizar(Medico medico);

    void eliminar(int id);
}
