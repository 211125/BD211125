package com.example.DB211125.services;

import com.example.DB211125.model.Cita;
import com.example.DB211125.repository.CitasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class CitasServices {

    @Autowired
    CitasRepository citasRepository;

    // Mostrar los Duenos En la base

    public ArrayList<Cita> obtenerCitas(){
        return (ArrayList<Cita>) citasRepository.findAll();
    }

    // Guarada los duenos en la base

    public Cita guardarCitas(Cita cita){
        return citasRepository.save(cita);
    }

    // muestra los duenos por medio de su ID
    public Optional<Cita> obtenerPorId(Long id){
        return citasRepository.findById(id);
    }

    // Elimina a los duenos por medio de ID

    public boolean eliminarCitas(Long id) {
        try{
            citasRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


   /* public ArrayList<Duenos>  obtenerPorCelular(String celular) {
        return duenosRepository.findBycelular(celular);
    }*/


}
