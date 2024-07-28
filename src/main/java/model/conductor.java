package model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class conductor {
    @Id
    private Long conductor_cedula;

    private String nombre;
    private String apellido;
    private  String email;
    private String contraseña;
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "placa", referencedColumnName = "placa")
    private bus bus ;

    @ManyToOne
    @JoinColumn(name = "notificacion", referencedColumnName = "notificacion")
    private notificaciones notificaciones;

    public Long getConductor_cedula() {
        return conductor_cedula;
    }

    public void setConductor_cedula(Long conductor_cedula) {
        this.conductor_cedula = conductor_cedula;
    }



    public notificaciones getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(notificaciones notificaciones) {
        this.notificaciones = notificaciones;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
