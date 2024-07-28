package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.security.PublicKey;

@Entity
public class notificaciones {
    @Id
    private Long notificacion;
    private String tipo;
    private String destinatario;
    private String mensaje;
    private String fecha_hora_envio;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "administrados", referencedColumnName = "administrador")
    private administrador administrador;

    public Long getNotificacion() {
        return notificacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFecha_hora_envio() {
        return fecha_hora_envio;
    }

    public void setFecha_hora_envio(String fecha_hora_envio) {
        this.fecha_hora_envio = fecha_hora_envio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNotificacion(Long notificacion) {
        this.notificacion = notificacion;
    }

    public administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(administrador administrador) {
        this.administrador = administrador;
    }
}
