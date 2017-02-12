/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Objects;

/**
 *
 * @author SP
 */
public class Especie {

    private String nombre;
    private int Periodo_Florescencia; //Dias// 
    private String Temporada_Siembra; //Rango De Meses En Que Florece// 
    private String Tipo_Suelo;
    private String Exposicion_Sol; //Alta-Media-Baja// 
    

    public Especie(String nombre, int Periodo_Florescencia, String Temporada_Siembra, String Tipo_Suelo, String Exposicion_Sol) {
        this.nombre = nombre;
        this.Periodo_Florescencia = Periodo_Florescencia;
        this.Temporada_Siembra = Temporada_Siembra;
        this.Tipo_Suelo = Tipo_Suelo;
        this.Exposicion_Sol = Exposicion_Sol;             
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeriodo_Florescencia() {
        return Periodo_Florescencia;
    }

    public void setPeriodo_Florescencia(int Periodo_Florescencia) {
        this.Periodo_Florescencia = Periodo_Florescencia;
    }

    public String getTemporada_Siembra() {
        return Temporada_Siembra;
    }

    public void setTemporada_Siembra(String Temporada_Siembra) {
        this.Temporada_Siembra = Temporada_Siembra;
    }

    public String getTipo_Suelo() {
        return Tipo_Suelo;
    }

    public void setTipo_Suelo(String Tipo_Suelo) {
        this.Tipo_Suelo = Tipo_Suelo;
    }

    public String getExposicion_Sol() {
        return Exposicion_Sol;
    }

    public void setExposicion_Sol(String Exposicion_Sol) {
        this.Exposicion_Sol = Exposicion_Sol;
    }

    @Override
    public String toString() {
        return "Especie{" + "nombre=" + nombre + ", Periodo_Florescencia=" + Periodo_Florescencia + '}';
    } 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + this.Periodo_Florescencia;
        hash = 83 * hash + Objects.hashCode(this.Temporada_Siembra);
        hash = 83 * hash + Objects.hashCode(this.Tipo_Suelo);
        hash = 83 * hash + Objects.hashCode(this.Exposicion_Sol);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Especie other = (Especie) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    

    public static void main(String[] args) {
        Especie esp1 = new Especie("Girasol", 6, "junio", "Seco", "Alto"); 
        Especie esp2 = new Especie("Margarita",8, "abril", "Humedo","Medio"); 
        
        System.out.println("" + esp1.equals(esp2));                                                  
    }

}
