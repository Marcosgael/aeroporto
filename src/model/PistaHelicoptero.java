/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leogo
 */
public class PistaHelicoptero extends Pista {
    private boolean heliponto;

    public PistaHelicoptero(int id, String identificacao, int comprimento, int largura, boolean heliponto) {
        super(id, identificacao, comprimento, largura);
        this.heliponto = heliponto;
    }

    public boolean isHeliponto() {
        return heliponto;
    }

    public void setHeliponto(boolean heliponto) {
        this.heliponto = heliponto;
    }
}

