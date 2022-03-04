package com.example.DB211125.services;

import com.example.DB211125.model.Mascotas;
import com.example.DB211125.repository.MascotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MascotasServices {

    @Autowired
    MacotasRepository mascotasRepository;

    // Mostrar las Mascotas En la base

    public ArrayList<Mascotas> obtenerMascotas() {
        return (ArrayList<Mascotas>) mascotasRepository.findAll();
    }

    // Guardar las mascotas en la base

    public Mascotas guardarMascotas(Mascotas mascotas) {
        return mascotasRepository.save(mascotas);
    }

    // muestra las mascotas por medio de su ID
    public Optional<Mascotas> obtenerPorId(Long id) {
        return mascotasRepository.findById(id);
    }

    // Elimina a las Mascotas por medio de ID

    public boolean eliminarMascotas(Long id) {
        try {
            mascotasRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}