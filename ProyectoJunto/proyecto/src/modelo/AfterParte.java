package modelo;

import java.sql.Date;

public class AfterParte {
 
    private int idParte ;
    private Date fecha;
    private int kmInicial;
    private int kmFinal;
    private int gasolina;
    private int peaje;
    private int dietas;
    private int otros;
    private String incidencia;
    private String estado;
    private Trabajador t;

    public AfterParte() {
    }

    public AfterParte(Date fecha, int kmInicial, int kmFinal, int gasolina, int peaje, int dietas, int otros, String incidencia, String estado, Trabajador t) {
        this.fecha = fecha;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.gasolina = gasolina;
        this.peaje = peaje;
        this.dietas = dietas;
        this.otros = otros;
        this.incidencia = incidencia;
        this.estado = estado;
        this.t = t;
    }

    public AfterParte(int idParte, Date fecha, int kmInicial, int kmFinal, int gasolina, int peaje, int dietas, int otros, String incidencia, String estado, Trabajador t) {
        this.idParte = idParte;
        this.fecha = fecha;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.gasolina = gasolina;
        this.peaje = peaje;
        this.dietas = dietas;
        this.otros = otros;
        this.incidencia = incidencia;
        this.estado = estado;
        this.t = t;
    }


    public int getIdParte() {
        return idParte;
    }

    public void setIdParte(int idParte) {
        this.idParte = idParte;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(int kmInicial) {
        this.kmInicial = kmInicial;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public int getPeaje() {
        return peaje;
    }

    public void setPeaje(int peaje) {
        this.peaje = peaje;
    }

    public int getDietas() {
        return dietas;
    }

    public void setDietas(int dietas) {
        this.dietas = dietas;
    }

    public int getOtros() {
        return otros;
    }

    public void setOtros(int otros) {
        this.otros = otros;
    }

    public String getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(String incidencia) {
        this.incidencia = incidencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Trabajador getT() {
        return t;
    }

    public void setT(Trabajador t) {
        this.t = t;
    }
    
    
    
    
}
