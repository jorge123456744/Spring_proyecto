package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class bus {

    @Id
    private  Long placa;

    private String capacidad;
    private  String modelo;
    private String estado;
    private String kilometraje;

    @ManyToOne
    @JoinColumn(name = "conductor_cedula", referencedColumnName = "conductor_cedula")
    private conductor conductor ;

    public Long getPlaca() {
        return placa;
    }

    public void setPlaca(Long placa) {
        this.placa = placa;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }
}
