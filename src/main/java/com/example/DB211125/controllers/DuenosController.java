package com.example.DB211125.controllers;


import com.example.DB211125.model.Duenos;
import com.example.DB211125.services.DuenosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/duenos")
public class DuenosController {
    @Autowired
    DuenosServices duenosServices;

    // Aca podemos  ver la lista de los duenos
    @GetMapping()
    public ArrayList<Duenos> obtenerDuenos(){
        return duenosServices.obtenerDuenos();
    }

    // aca podemos guardar los duenos en este caso agregamos con el postman
    @PostMapping()
    public Duenos guardarDuenos(@RequestBody Duenos duenos){
        return this.duenosServices.guardarDuenos(duenos);
    }

    // aca buscarmos el dueno por medio del ID
    @GetMapping( path = "/{id}")
    public Optional<Duenos> obtenerDuenosPorId(@PathVariable("id") Long id) {
        return this.duenosServices.obtenerPorId(id);
    }

    // Aca eliminamos el usuario por medio el ID
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.duenosServices.eliminarDuenos(id);
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
