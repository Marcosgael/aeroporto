/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leogo
 */
public class Hangar {
    private int id;
    private String identificacao;
    private boolean estacionamento;
    private boolean manutencao;

    public Hangar(int id, String identificacao, boolean estacionamento, boolean manutencao) {
        this.id = id;
        this.identificacao = identificacao;
        this.estacionamento = estacionamento;
        this.manutencao = manutencao;
    }

    public int getId() {
        return id;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public boolean isEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(boolean estacionamento) {
        this.estacionamento = estacionamento;
    }

    public boolean isManutencao() {
        return manutencao;
    }

    public void setManutencao(boolean manutencao) {
        this.manutencao = manutencao;
    }
}

