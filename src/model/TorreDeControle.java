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
public class TorreDeControle {
    private int id;
    private String identificacao;
    private List<Controlador> controladores;

    public TorreDeControle(int id, String identificacao) {
        this.id = id;
        this.identificacao = identificacao;
        this.controladores = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public List<Controlador> getControladores() {
        return controladores;
    }

    public void adicionarControlador(Controlador controlador) {
        controladores.add(controlador);
    }

    public void removerControlador(Controlador controlador) {
        controladores.remove(controlador);
    }

    public void solicitarProcedimentosPouso(Aviao aviao) {
        // Lógica para solicitar os procedimentos de pouso ao avião
        System.out.println("Solicitando procedimentos de pouso para o avião " + aviao.getIdentificacao());
    }

    public void solicitarProcedimentosDecolagem(Aviao aviao) {
        // Lógica para solicitar os procedimentos de decolagem ao avião
        System.out.println("Solicitando procedimentos de decolagem para o avião " + aviao.getIdentificacao());
    }
}
