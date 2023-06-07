/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leogo
 */
public class PistaAsaFixa extends Pista {
    private boolean luzes;

    public PistaAsaFixa(int id, String identificacao, int comprimento, int largura, boolean luzes) {
        super(id, identificacao, comprimento, largura);
        this.luzes = luzes;
    }

    public boolean isLuzes() {
        return luzes;
    }

    public void setLuzes(boolean luzes) {
        this.luzes = luzes;
    }
}
