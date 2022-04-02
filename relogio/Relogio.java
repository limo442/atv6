/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relogio;

/**
 *
 * @author alunocmc
 */
public class Relogio {

    private int hora;
    private int minuto;
    private int segundo;

    //construtor #1
    public Relogio() {

        hora = 0;
        minuto = 0;
        segundo = 0;
    }

//construtor #2
    public Relogio(int h) {
        if (hora >= 0 && hora <= 24) {

            hora = h;
            minuto = 0;
            segundo = 0;
        } else {
            System.out.println("Hora inválida!");
        }
    }

//construtor #3
    public Relogio(int h, int m) {
        if (hora >= 0 && hora <= 24 && minuto >= 0 && minuto <= 60) {
            hora = h;
            minuto = m;
            segundo = 0;
        } else {
            System.out.println("Hora e minutos inválidos");
        }
    }

//construtor #4
    public Relogio(int h, int m, int s) {
        if (hora >= 0 && hora <= 24 && minuto >= 0 && minuto <= 60 && segundo >= 0 && segundo <= 60) {
            hora = h;
            minuto = m;
            segundo = s;
        } else {
            System.out.println("Hora, minutos e segundos inválidos");

        }
    }

    public void setHora(int x) {
        if (x >= 0 && x <= 60) {
            hora = x;
        } else {
            System.out.println("Hora inválida!");
        }
    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int x) {
        if (x >= 0 && x <= 60) {

            minuto = x;
        } else {
            System.out.println("Minutos inválidos!");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setSegundo(int x) {

        if (x >= 0 && x <= 60) {
            segundo = x;
        } else {
            System.out.println("Segundos inválidos!");
        }
    }

    public int getSegundo() {
        return segundo;
    }

}
