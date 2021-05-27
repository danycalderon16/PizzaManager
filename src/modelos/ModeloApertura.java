
package modelos;

public class ModeloApertura {
    
    private int billeteMil;
    private int billeteQuinientos;
    private int billeteDoscientso;
    private int billeteCien;
    private int billeteCincuenta;
    private int billeteVeinte;
    private int monedaVeinte;
    private int monedaDiez;
    private int monedaCinco;
    private int monedaDos;
    private int monedaPeso;
    private int monedaCincuentaCen;
    private double apertura;
    private String hora;

    public int getBilleteMil() {
        return billeteMil;
    }

    public void setBilleteMil(int billeteMil) {
        this.billeteMil = billeteMil;
    }

    public int getBilleteQuinientos() {
        return billeteQuinientos;
    }

    public void setBilleteQuinientos(int billeteQuinientos) {
        this.billeteQuinientos = billeteQuinientos;
    }

    public int getBilleteDoscientso() {
        return billeteDoscientso;
    }

    public void setBilleteDoscientso(int billeteDoscientso) {
        this.billeteDoscientso = billeteDoscientso;
    }

    public int getBilleteCien() {
        return billeteCien;
    }

    public void setBilleteCien(int billeteCien) {
        this.billeteCien = billeteCien;
    }

    public int getBilleteCincuenta() {
        return billeteCincuenta;
    }

    public void setBilleteCincuenta(int billeteCincuenta) {
        this.billeteCincuenta = billeteCincuenta;
    }

    public int getBilleteVeinte() {
        return billeteVeinte;
    }

    public void setBilleteVeinte(int billeteVeinte) {
        this.billeteVeinte = billeteVeinte;
    }

    public int getMonedaVeinte() {
        return monedaVeinte;
    }

    public void setMonedaVeinte(int monedaVeinte) {
        this.monedaVeinte = monedaVeinte;
    }

    public int getMonedaDiez() {
        return monedaDiez;
    }

    public void setMonedaDiez(int monedaDiez) {
        this.monedaDiez = monedaDiez;
    }

    public int getMonedaCinco() {
        return monedaCinco;
    }

    public void setMonedaCinco(int monedaCinco) {
        this.monedaCinco = monedaCinco;
    }

    public int getMonedaDos() {
        return monedaDos;
    }

    public void setMonedaDos(int monedaDos) {
        this.monedaDos = monedaDos;
    }

    public int getMonedaPeso() {
        return monedaPeso;
    }

    public void setMonedaPeso(int monedaPeso) {
        this.monedaPeso = monedaPeso;
    }

    public int getMonedaCincuentaCen() {
        return monedaCincuentaCen;
    }

    public void setMonedaCincuentaCen(int monedaCincuentaCen) {
        this.monedaCincuentaCen = monedaCincuentaCen;
    }

    public double getApertura() {
        return apertura;
    }

    public void setApertura(double apertura) {
        this.apertura = apertura;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
           
    public double sumar(){
        this.apertura = 0;
        
        this.apertura += 1000*this.billeteMil;
        this.apertura += 500*this.billeteQuinientos;
        this.apertura += 200*this.billeteDoscientso;
        this.apertura += 100*this.billeteCien;
        this.apertura += 50*this.billeteCincuenta;
        this.apertura += 20*this.billeteVeinte;
        
        this.apertura += 20*this.monedaVeinte;
        this.apertura += 10*this.monedaDiez;
        this.apertura += 5*this.monedaCinco;
        this.apertura += 2*this.monedaDos;
        this.apertura += 1*this.monedaPeso;
        this.apertura += 0.5*this.monedaCincuentaCen;
        
        return this.apertura;
    }          
    
}
