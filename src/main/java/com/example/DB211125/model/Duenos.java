package com.example.DB211125.model;


import javax.persistence.*;

@Entity
@Table(name = "duenos")
public class Duenos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String direccion;
    private Integer celular;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCelular(){
        return celular;
    }

    public void setCelular(Integer celular){
        this.celular = celular;
    }

}
