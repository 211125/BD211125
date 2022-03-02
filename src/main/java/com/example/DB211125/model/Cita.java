package com.example.DB211125.model;


import javax.persistence.*;

@Entity
@Table(name = "cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String servicioRequerido;
    private String fecha;
    private String  hora;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getservicioRequerido() {
        return servicioRequerido;
    }

    public void setservicioRequerido(String servicioRequerido){
        this.servicioRequerido = servicioRequerido;
    }

    public String getfecha() {
        return fecha;
    }

    public void setfecha(String fecha) {
        this.fecha = fecha;
    }

    public String gethora(){
        return hora;
    }

    public void sethora(String hora){
        this.hora = hora;
    }


}
