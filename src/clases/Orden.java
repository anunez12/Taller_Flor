/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import java.util.Date;

import java.util.Objects;

/**
 *
 * @author SP
 */
public class Orden {

    private Date fecha; // Tipo de dato que se utiliza para expresar la fecha total en dia/mes/año// 
    private int numero;
    private double cantidad;
    private String flores;
    private long Cantidad_Total;

    public Orden(Date fecha, int numero, double cantidad, String flores, long Cantidad_Total) {
        this.fecha = fecha;
        this.numero = numero;
        this.cantidad = cantidad;
        this.flores = flores;
        this.Cantidad_Total = Cantidad_Total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getFlores() {
        return flores;
    }

    public void setFlores(String flores) {
        this.flores = flores;
    }

    public long getCantidad_Total() {
        return Cantidad_Total;
    }

    public void setCantidad_Total(long Cantidad_Total) {
        this.Cantidad_Total = Cantidad_Total;
    }

    @Override
    public String toString() {
        return "Orden{" + "fecha=" + fecha + ", numero=" + numero + ", cantidad=" + cantidad + ", flores=" + flores + ", Cantidad_Total=" + Cantidad_Total + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.fecha);
        hash = 61 * hash + this.numero;
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.cantidad) ^ (Double.doubleToLongBits(this.cantidad) >>> 32));
        hash = 61 * hash + Objects.hashCode(this.flores);
        hash = 61 * hash + (int) (this.Cantidad_Total ^ (this.Cantidad_Total >>> 32));
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
        final Orden other = (Orden) obj;
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (Double.doubleToLongBits(this.cantidad) != Double.doubleToLongBits(other.cantidad)) {
            return false;
        }
        if (!Objects.equals(this.flores, other.flores)) {
            return false;
        }
        if (this.Cantidad_Total != other.Cantidad_Total) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Orden num1 = new Orden("5/6/2017",12,23,"Girasol",600000);
        System.out.println(""+num1);    
        
    }
   

    }


