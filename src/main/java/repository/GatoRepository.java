/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import DAO.GatoDAO;
import Persistencia_.GatoJpaController;
import Persistencia_.exceptions.NonexistentEntityException;
import entidades.Gato;
import java.util.List;

/**
 *
 * @author mateo
 */
public class GatoRepository  implements GatoDAO{
       public GatoJpaController controllerGatoJpa;
    
    public GatoRepository() {
        this.controllerGatoJpa = new GatoJpaController();
    }

    @Override
    public Gato obtenerPorId(int id) {
        return controllerGatoJpa.findGato(id);
    }

    @Override
    public List<Gato> obtenerTodos() {
        return controllerGatoJpa.findGatoEntities();
    }

    @Override
    public void guardar(Gato gato) {
        controllerGatoJpa.create(gato);
    }

    @Override
    public void actualizar(Gato gato) {
        try {
            controllerGatoJpa.edit(gato);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void eliminar(int id) {
        try {
            controllerGatoJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace();
        }
    }
}