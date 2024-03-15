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
    private String marca;
    private String modelo;
    private String tipo;
    private int km;
    private String status;
    
    /**
     * @param marca
     * @param modelo
     * @param tipo
     * @param km
     * @param tipo
     */
    public Vehiculo(String marca, String modelo, int km, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.km = km;
        calcStatus();
    }
    
    public Vehiculo() {
        this.marca = "";
        this.modelo = "";
        this.tipo = "";
        this.km = 0;
    }
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }
    /**
     * @param nombre the marca to set
     */
    public void setMarca(String nombre) {
        this.marca = nombre;
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
     * @return the km
     */
    public int getKm() {
        return km;
    }
    /**
     * @param km the km to set
     */
    public void setKm(int km) {
        this.km = km;
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
        if(this.getKm() < 0) {
            this.setStatus("Kilometraje invalido");
        } else if(km <50000) {
            this.setStatus("El Auto es Nuevo");
        } else if(km<100000){
            this.setStatus("El Auto tiene medio Uso");
            
        } else if(km<200000){
            this.setStatus("El Auto es Viejo");
        } else {
            this.setStatus("El auto es Chatarra");
        }
    }

    public String mostrarVehiculo() {
        String resultado = "";
        resultado += ("Marca: " + marca+"\n");
        resultado +=( "El modelo es: " + modelo +"\n");
        resultado  += ( "Es de tipo: " + tipo +"\n");
        resultado += ( "Tiene un kilometraje de: " + km +"\n");
        resultado += ( "Estatus: " + status +"\n");
        return resultado;
    }
    public void borrar() {
        this.setMarca("");
        this.setModelo("");
        this.setKm(0);
        this.setTipo("");
        this.setStatus("");
    }
    
}
