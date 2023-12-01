/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import entidades.Perro;
import java.util.List;

/**
 *
 * @author mateo
 */
public interface PerroDAO {
    Perro obtenerPorId(int id);
    List<Perro> obtenerTodos();
    void guardar(Perro perro);
    void actualizar(Perro perro);
    void eliminar(int  id);
}
