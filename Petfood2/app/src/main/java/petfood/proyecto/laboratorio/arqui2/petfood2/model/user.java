package petfood.proyecto.laboratorio.arqui2.petfood2.model;

/**
 * Created by FG250 on 05/01/2017.
 */

public class user {

    private String nombre;
    private String correo;
    private String mascota;
    private String tipo;
    private int edadmascota;
    private String tamano;
    private String horario;
    private int porcion;

    public user(){

    }

    public user(String n, String c, String m, String t, int e, String tam, String h, int p){
        this.setNombre(n);
        this.setCorreo(c);
        this.setMascota(m);
        this.setTipo(t);
        this.setEdadmascota(e);
        this.setTamano(tam);
        this.setHorario(h);
        this.setPorcion(p);


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdadmascota() {
        return edadmascota;
    }

    public void setEdadmascota(int edadmascota) {
        this.edadmascota = edadmascota;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getPorcion() {
        return porcion;
    }

    public void setPorcion(int porcion) {
        this.porcion = porcion;
    }
}
