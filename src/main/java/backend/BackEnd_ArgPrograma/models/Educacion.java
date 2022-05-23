package backend.BackEnd_ArgPrograma.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String estableEdu;
    private String tituloEdu;
    private String fechaEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String estableEdu, String tituloEdu, String fechaEdu) {
        this.idEdu = idEdu;
        this.estableEdu = estableEdu;
        this.tituloEdu = tituloEdu;
        this.fechaEdu = fechaEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getEstableEdu() {
        return estableEdu;
    }

    public void setEstableEdu(String estableEdu) {
        this.estableEdu = estableEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public String getFechaEdu() {
        return fechaEdu;
    }

    public void setFechaEdu(String fechaEdu) {
        this.fechaEdu = fechaEdu;
    }
}
