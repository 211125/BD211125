package com.example.DB211125.services;

import com.example.DB211125.model.Duenos;
import com.example.DB211125.repository.DuenosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class DuenosServices {

    @Autowired
    DuenosRepository duenosRepository;

    // Mostrar los Duenos En la base

    public ArrayList<Duenos> obtenerDuenos(){
        return (ArrayList<Duenos>) duenosRepository.findAll();
    }

    // Guarada los duenos en la base

    public Duenos guardarDuenos(Duenos duenos){
        return duenosRepository.save(duenos);
    }

    // muestra los duenos por medio de su ID
    public Optional<Duenos> obtenerPorId(Long id){
        return duenosRepository.findById(id);
    }

    // Elimina a los duenos por medio de ID

    public boolean eliminarDuenos(Long id) {
        try{
            duenosRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


   /* public ArrayList<Duenos>  obtenerPorCelular(String celular) {
        return duenosRepository.findBycelular(celular);
    }*/


}
