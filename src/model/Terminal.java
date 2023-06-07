/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leogo
 */
public class Terminal {
    private int id;
    private String identificacao;

    public Terminal(int id, String identificacao) {
        this.id = id;
        this.identificacao = identificacao;
    }

    public int getId() {
        return id;
    }

    public String getIdentificacao() {
        return identificacao;
    }
}

