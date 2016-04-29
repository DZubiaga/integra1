/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 1gprog08
 */
public class Viaje {
    
    private int albaran;
    private String horaSalida;
    private String horaLlegada;
    private String matricula;
    private int parte;

    public Viaje() {
    }

    public Viaje(int albaran, String horaSalida, String horaLlegada, String matricula, int parte) {
        this.albaran = albaran;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.matricula = matricula;
        this.parte = parte;
    }

    public Viaje(int albaran, String horaSalida, String horaLlegada, String matricula) {
        this.albaran = albaran;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.matricula = matricula;
    }

    public int getAlbaran() {
        return albaran;
    }

    public void setAlbaran(int albaran) {
        this.albaran = albaran;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getParte() {
        return parte;
    }

    public void setParte(int parte) {
        this.parte = parte;
    }
    
    
    
}
