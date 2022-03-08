package com.example.DB211125.controllers;

import com.example.DB211125.model.Mascotas;
import com.example.DB211125.services.MascotasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/mascotas")
public class MascotasController {
    @Autowired
    MascotasServices mascotasServices;

    // Aca podemos ver la lista de las mascotas
    @GetMapping()
    public ArrayList<ListMascotas> obtenerMascotas() {
        return mascotasServices.obtenerMascotas();
    }

    // aca podemos guardar las mascotas en este caso agregamos con el postman
    @PostMapping()
    public Mascotas guardarMascotas(@RequestBody Mascotas mascotas) {
        return this.mascotasServices.guardarMascotas(mascotas);
    }

    // aca buscarmos la mascota por medio del ID
    @GetMapping(path = "/{id}")
    public Optional<Mascotas> obteneMascotasPorId(@PathVariable("id") Long id) {
        return this.mascotasServices.obtenerPorId(id);
    }

    // Aca eliminamos el usuario por medio el ID
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.mascotasServices.eliminarMascotas(id);
        if (ok) {
            return "Se eliminó el usuario con id: " + id;
        } else {
            return "No pudo eliminar el usuario con id: " + id;
        }
    }
}
