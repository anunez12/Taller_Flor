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
public class Sistema {

    private String ordenes; //Rango de ordenes almacenadas en el sistema Mucha,Normal,Poca// 
    private int flores; // Cantidad de flores almacenadas en el sistema// 
    private int especies; // Cantidad de especies almacenadas en el sistema// 

    public Sistema(String ordenes, int flores, int especies) {
        this.ordenes = ordenes;
        this.flores = flores;
        this.especies = especies;
    }

    public String getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(String ordenes) {
        this.ordenes = ordenes;
    }

    public int getFlores() {
        return flores;
    }

    public void setFlores(int flores) {
        this.flores = flores;
    }

    public int getEspecies() {
        return especies;
    }

    public void setEspecies(int especies) {
        this.especies = especies;
    }

    @Override
    public String toString() {
        return "Sistema{" + "ordenes=" + ordenes + ", flores=" + flores + ", especies=" + especies + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.ordenes);
        hash = 83 * hash + this.flores;
        hash = 83 * hash + this.especies;
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
        final Sistema other = (Sistema) obj;
        if (!Objects.equals(this.ordenes, other.ordenes)) {
            return false;
        }
        if (this.flores != other.flores) {
            return false;
        }
        if (this.especies != other.especies) {
            return false;
        }
        return true;
    } 
    public static void main(String[] args) {
       Sistema num1 = new Sistema("Mucha",16,22); 
       Sistema num2 = new Sistema("Poca", 5,2); 
       
        System.out.println(""+num1.equals(num2));        
    }

}
