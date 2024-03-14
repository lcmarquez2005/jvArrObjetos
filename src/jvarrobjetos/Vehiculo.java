/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jvarrobjetos;

/**
 *
 * @author lcarl
 */
public class Vehiculo {
    private String nombre;
    private String modelo;
    private String tipo;
    private int kilometraje;
    private String tipoMotor;
    private String status;
    
    /**
     * @param nombre
     * @param modelo
     * @param tipo
     * @param kilometraje
     * @param tipoMotor
     */
    public Vehiculo(String nombre, String modelo, String tipo, int kilometraje, String tipoMotor) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.tipo = tipo;
        this.kilometraje = kilometraje;
        this.tipoMotor = tipoMotor;
        calcStatus();
    }
    
    public Vehiculo() {
        this.nombre = "";
        this.modelo = "";
        this.tipo = "";
        this.kilometraje = 0;
        this.tipoMotor = "";
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * @return the kilometraje
     */
    public int getKilometraje() {
        return kilometraje;
    }
    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
    /**
     * @return the tipoMotor
     */
    public String getTipoMotor() {
        return tipoMotor;
    }
    /**
     * @param tipoMotor the tipoMotor to set
     */
    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }




    public void apagar() {

    }
    public void encender() {

    }
    public void cruzar(char direccion ) {
        //metodo para girar acorde al parametro de direccion
    }
    public void frenar() {

    }

    public void calcStatus() {
        
    }

    public String mostrarVehiculo() {
        String resultado = "";
        resultado += ("Nombre: " + nombre+"\n");
        resultado +=( "El modelo es: " + modelo +"\n");
        resultado  += ( "Es de tipo: " + tipo +"\n");
        resultado += ( "Tiene un kilometraje de: " + kilometraje +"\n");
        resultado += ( "Estatus: " + status +"\n");
        return resultado;
    }
    public void borrar() {
        this.nombre = "";
        this.modelo = "";
        this.tipo = "";
        this.kilometraje = 0;
        this.tipoMotor = "";
    }

    


    

    
}
