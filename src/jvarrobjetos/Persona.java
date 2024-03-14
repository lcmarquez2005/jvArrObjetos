/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jvarrobjetos;

/**
 *
 * @author lcarl
 */
public class Persona {
    private String nombre;
    private int edad;
    private double estatura;
    private double peso;
    private double imc;//indicemasacorporal
    private String status;
    public String mensajes;
    //Constructor
    public Persona() {
        nombre = "";
        edad = 0;
        estatura= 0;
        peso = 0;
        imc = 0;
        status = "";
    }

    public Persona(String nombre, int edad, double estatura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        calcImc();
        calcStatus();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

    public void calcImc() {
        double calculo = peso / Math.pow(estatura, 2);
        this.setImc(calculo);
        // return calculo;
    }
        
    public void calcStatus() {
        String status = "";
        if(imc < 18.5) {
            status = "Bajo Peso";
        } else if( imc >= 18.5 && imc <= 24.9) {
            status = "Normal";
        } else if( imc >= 25 && imc <= 29.9 ) {
            status = "Sobrepeso";
        } else if( imc >= 30) {
            status = "Obesidad";
        }
        this.status = status;
    }

    // @Override
    public String mostrarPersona() {
        String resultado = "";
        resultado += ("Nombre: " + nombre+"\n");
        resultado +=( "Edad: " + edad +" años\n");
        resultado  += ( "Estatura: " + estatura +" m\n");
        resultado += ( "Peso: " + peso +" kg\n");
        resultado += ( "IMC: " + imc +"\n");
        resultado += ( "Estatus: " + status +"\n");
        return resultado;
    }


}
