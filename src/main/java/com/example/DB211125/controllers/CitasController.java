package com.example.DB211125.controllers;


import com.example.DB211125.model.Cita;
import com.example.DB211125.services.CitasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/citas")
public class CitasController {
    @Autowired
    CitasServices citasServices;

    // Aca podemos  ver la lista de los duenos
    @GetMapping()
    public ArrayList<Cita> obtenerCitas(){
        return citasServices.obtenerCitas();
    }

    // aca podemos guardar los duenos en este caso agregamos con el postman
    @PostMapping()
    public Cita guardarCitas(@RequestBody Cita cita){
        return this.citasServices.guardarCitas(cita);
    }

    // aca buscarmos el dueno por medio del ID
    @GetMapping( path = "/{id}")
    public Optional<Cita> obtenerCitasPorId(@PathVariable("id") Long id) {
        return this.citasServices.obtenerPorId(id);
    }

    // Aca eliminamos el usuario por medio el ID
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.citasServices.eliminarCitas(id);
        if (ok){
            return "Se eliminó el usuario con id: " + id;
        }else{
            return "No pudo eliminar el usuario con id: " + id;
        }
    }

    // Aca vamos a buscae el usuario por medio de su numero Celular
   /* @GetMapping("/query")
    public ArrayList<Duenos> obtenerDuenosPorCelular(@RequestParam("celualr") String celular){
        return this.duenosServices.obtenerPorcelular(celular);
    }*/

}
