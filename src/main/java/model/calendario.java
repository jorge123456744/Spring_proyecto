package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class calendario {
    @Id
    private Long calendario;

    private String titulo_evento;
    private String descripcion_evento;


    public Long getCalendario() {
        return calendario;
    }

    public void setCalendario(Long calendario) {
        this.calendario = calendario;
    }

    public String getTitulo_evento() {
        return titulo_evento;
    }

    public void setTitulo_evento(String titulo_evento) {
        this.titulo_evento = titulo_evento;
    }

    public String getDescripcion_evento() {
        return descripcion_evento;
    }

    public void setDescripcion_evento(String descripcion_evento) {
        this.descripcion_evento = descripcion_evento;
    }
}
