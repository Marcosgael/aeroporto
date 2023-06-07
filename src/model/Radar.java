/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leogo
 */
public class Radar {
    private int id;
    private String identificacao;
    private List<Aeroporto> aeroportos;

    public Radar(int id, String identificacao) {
        this.id = id;
        this.identificacao = identificacao;
        this.aeroportos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public List<Aeroporto> getAeroportos() {
        return aeroportos;
    }

    public void adicionarAeroporto(Aeroporto aeroporto) {
        aeroportos.add(aeroporto);
    }

    public void removerAeroporto(Aeroporto aeroporto) {
        aeroportos.remove(aeroporto);
    }
}
