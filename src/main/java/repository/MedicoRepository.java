/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import DAO.MedicoDAO;
import Persistencia_.MedicoJpaController;
import Persistencia_.exceptions.NonexistentEntityException;
import entidades.Medico;
import java.util.List;

/**
 *
 * @author mateo
 */
public class MedicoRepository implements MedicoDAO{
        
    public MedicoJpaController controllerMedicoJpa;
    
    public MedicoRepository() {
        this.controllerMedicoJpa = new MedicoJpaController();
    }

    @Override
    public Medico obtenerPorId(int id) {
        return controllerMedicoJpa.findMedico(id);
    }

    @Override
    public List<Medico> obtenerTodos() {
        return controllerMedicoJpa.findMedicoEntities();
    }

    @Override
    public void guardar(Medico medico) {
        controllerMedicoJpa.create(medico);
    }

    @Override
    public void actualizar(Medico medico) {
        try {
            controllerMedicoJpa.edit(medico);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void eliminar(int id) {
        try {
            controllerMedicoJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace();
        }
    }
}
