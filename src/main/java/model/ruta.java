package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ruta {
    @Id
     private Long ruta;

    private String colegio;
    private String origen;
    private String destino;

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
