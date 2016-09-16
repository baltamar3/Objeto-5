/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author baltamar
 */
public class Cuenta {

    private String nombre;
    private long numero_cuenta;
    private long identificacion;
    private double saldo_actual;
    private double interes_anual;

    public Cuenta(String nombre, long numero_cuenta, long identificacion, double saldo_actual, double interes_anual) {
        this.nombre = nombre;
        this.numero_cuenta = numero_cuenta;
        this.identificacion = identificacion;
        this.saldo_actual = saldo_actual;
        this.interes_anual = interes_anual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(long numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public double getInteres_anual() {
        return interes_anual;
    }

    public void setInteres_anual(double interes_anual) {
        this.interes_anual = interes_anual;
    }

   public void consignar(double consignacion) {
        double aux;
        
        aux=this.saldo_actual+consignacion;
        this.setSaldo_actual(aux);

    }

    public void retirar(double retiro) {
        double aux;
        
        aux=this.saldo_actual-retiro;
        this.setSaldo_actual(aux);
    }

    public void aplicarInteres() {
        double aux,aux2;
        
        aux=this.getSaldo_actual() * (interes_anual / 365);
        aux2=this.getSaldo_actual()+aux;
        
        this.setSaldo_actual(aux2);
    }

    public String mostrar() {
        String aux;
        aux = "No. de la cuenta: " + this.numero_cuenta + "\n"
                + "Nonbre del cliente: " + this.nombre + "\n"
                + "No. de identificacion: " + this.identificacion + "\n"
                + "Saldo actual: " + this.getSaldo_actual();
        return aux;
    }

    
}
