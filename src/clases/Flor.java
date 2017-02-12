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
public class Flor {    

    private String especie; 
    private String nombre; 
    private long codigo; //serial de numeros de una flor que pueden ser muy extensos// 
    private double Precio_Venta;      

    public Flor(String especie, String nombre, long codigo, double Precio_Venta) {
        this.especie = especie;
        this.nombre = nombre;
        this.codigo = codigo;
        this.Precio_Venta = Precio_Venta;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public double getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(double Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }

    @Override
    public String toString() {
        return "Flor{" + "especie=" + especie + ", nombre=" + nombre + ", codigo=" + codigo + ", Precio_Venta=" + Precio_Venta + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.especie);
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.Precio_Venta) ^ (Double.doubleToLongBits(this.Precio_Venta) >>> 32));
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
        final Flor other = (Flor) obj;
        if (!Objects.equals(this.especie, other.especie)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Double.doubleToLongBits(this.Precio_Venta) != Double.doubleToLongBits(other.Precio_Venta)) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Flor F_num1 = new Flor("Guzmania", "Girasol",567908456,200000); 
        Flor F_num2 = new Flor("Jasmine","FlorNegro",32891918,300000); 
        
        System.out.println(""+F_num1.equals(F_num2));        
    }                
}
