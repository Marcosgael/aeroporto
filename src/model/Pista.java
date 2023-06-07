/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leogo
 */
public abstract class Pista {
    private int id;
    private String identificacao;
    private int comprimento;
    private int largura;

    public Pista(int id, String identificacao, int comprimento, int largura) {
        this.id = id;
        this.identificacao = identificacao;
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int getId() {
        return id;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public int getComprimento() {
        return comprimento;
    }

    public int getLargura() {
        return largura;
    }

    @Override
    public String toString() {
        return identificacao;
    }
}
