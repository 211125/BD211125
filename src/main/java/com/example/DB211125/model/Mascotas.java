package com.example.DB211125.model;

import javax.persistence.*;

@Entity
@Table(name = "Mascotas")
public class Mascotas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String tipoDeMascota;
    private String nombre;
    private String fechaDeIngreso;
    private String motivoDeVisita;
    private String dueno;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoDeMascota() {
        return tipoDeMascota;
    }

    public void setTipoDeMascota(String tipoDeMascota) {
        this.tipoDeMascota = tipoDeMascota;
    }

     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(String fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public String getMotivoDeVisita(){
        return motivoDeVisita;
    }

    public void setMotivoDeVisita(String motivoDeVisita){
        this.motivoDeVisita = motivoDeVisita;
    }

    public String getDueno(){
        return dueno;
    }

    public void setDueno(String dueno){
        this.dueno = dueno;
    }

}
