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

    @GetMapping()
    public ArrayList<Duenos> obtenerDuenos(){
        return duenosServices.obtenerDuenos();
    }

    @PostMapping()
    public Duenos guardarDuenos(@RequestBody Duenos duenos){
        return this.duenosServices.guardarDuenos(duenos);
    }

    @GetMapping( path = "/{id}")
    public Optional<Duenos> obtenerDuenosPorId(@PathVariable("id") Long id) {
        return this.duenosServices.obtenerPorId(id);
    }


    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.duenosServices.eliminarDuenos(id);
        if (ok){
            return "Se eliminó el usuario con id: " + id;
        }else{
            return "No pudo eliminar el usuario con id: " + id;
        }
    }


   /* @GetMapping("/query")
    public ArrayList<Duenos> obtenerDuenosPorCelular(@RequestParam("celualr") String celular){
        return this.duenosServices.obtenerPorcelular(celular);
    }*/

}
