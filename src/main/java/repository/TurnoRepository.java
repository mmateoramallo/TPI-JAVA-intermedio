/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import DAO.TurnoDAO;
import Persistencia_.TurnoJpaController;
import Persistencia_.exceptions.NonexistentEntityException;
import entidades.Turno;
import java.util.List;

/**
 *
 * @author mateo
 */
public class TurnoRepository implements TurnoDAO {

    public TurnoJpaController controllerTurnoJpa;

    public TurnoRepository() {
        this.controllerTurnoJpa = new TurnoJpaController();
    }

    @Override
    public Turno obtenerPorId(int id) {
        return controllerTurnoJpa.findTurno(id);
    }

    @Override
    public List<Turno> obtenerTodos() {
        return controllerTurnoJpa.findTurnoEntities();
    }

    @Override
    public void guardar(Turno turno) {
        controllerTurnoJpa.create(turno);
    }

    @Override
    public void actualizar(Turno turno) {
        try {
            controllerTurnoJpa.edit(turno);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void eliminar(int id) {
        try {
            controllerTurnoJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace();
        }
    }
}
