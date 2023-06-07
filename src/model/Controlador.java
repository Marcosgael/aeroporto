/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leogo
 */
public class Controlador {
    private int id;
    private String nome;
    private String identificacao;

    public Controlador(int id, String nome, String identificacao) {
        this.id = id;
        this.nome = nome;
        this.identificacao = identificacao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void solicitarProcedimentosPouso(Aviao aviao) {
        // Lógica para solicitar os procedimentos de pouso ao avião
        System.out.println("Controlador " + nome + " solicitando procedimentos de pouso para o avião " + aviao.getIdentificacao());
    }

    public void solicitarProcedimentosDecolagem(Aviao aviao) {
        // Lógica para solicitar os procedimentos de decolagem ao avião
        System.out.println("Controlador " + nome + " solicitando procedimentos de decolagem para o avião " + aviao.getIdentificacao());
    }
}

