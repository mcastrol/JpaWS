package jpaws;


import javax.persistence.*;


@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Empresa() {
    }

    public Empresa(String nombre, String email, String web, String tipoSociedad, String nif) {
        this.nombre = nombre;
        this.email = email;
        this.web = web;
        this.tipoSociedad = tipoSociedad;
        this.nif = nif;
    }

    public Empresa(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    

    private String nombre;


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    private String web;
    
    public String getWeb() {
        return web;
    }
    public void setWeb(String web) {
        this.web = web;
    }

    

    private String tipoSociedad;

    public String getTipoSociedad() {
        return tipoSociedad;
    }

    public void setTipoSociedad(String tipoSociedad) {
        this.tipoSociedad = tipoSociedad;
    }

    private String nif;
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", web='" + web + '\'' +
                ", tipoSociedad='" + tipoSociedad + '\'' +
                ", nif='" + nif + '\'' +
                '}';
    }
}
