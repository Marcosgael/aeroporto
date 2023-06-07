/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leogo
 */
import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
    private int id;
    private String identificacao;
    private List<Pista> pistas;
    private List<Terminal> terminais;
    private List<Hangar> hangares;
    private TorreDeControle torreDeControle;
    private Radar radar;

    public Aeroporto(int id, String identificacao, TorreDeControle torreDeControle, Radar radar) {
        this.id = id;
        this.identificacao = identificacao;
        this.pistas = new ArrayList<>();
        this.terminais = new ArrayList<>();
        this.hangares = new ArrayList<>();
        this.torreDeControle = torreDeControle;
        this.radar = radar;
    }

    public int getId() {
        return id;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public List<Pista> getPistas() {
        return pistas;
    }

    public void adicionarPista(Pista pista) {
        pistas.add(pista);
    }

    public void removerPista(Pista pista) {
        pistas.remove(pista);
    }

    public List<Terminal> getTerminais() {
        return terminais;
    }

    public void adicionarTerminal(Terminal terminal) {
        terminais.add(terminal);
    }

    public void removerTerminal(Terminal terminal) {
        terminais.remove(terminal);
    }

    public List<Hangar> getHangares() {
        return hangares;
    }

    public void adicionarHangar(Hangar hangar) {
        hangares.add(hangar);
    }

    public void removerHangar(Hangar hangar) {
        hangares.remove(hangar);
    }

    public TorreDeControle getTorreDeControle() {
        return torreDeControle;
    }

    public Radar getRadar() {
        return radar;
    }
}

