/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leogo
 */
public class Aviao extends Aeronave {
    private int numeroVoo;
    private Aeroporto origem;
    private Aeroporto destino;
  
    public Aviao(int id, String modelo, String identificacao, boolean asaFixa, TremDePouso tremDePouso, int numeroVoo, Aeroporto origem, Aeroporto destino) {
        super(id, modelo, identificacao, asaFixa, tremDePouso);
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
    }
  
    public int getNumeroVoo() {
        return numeroVoo;
    }
  
    public Aeroporto getOrigem() {
        return origem;
    }
  
    public Aeroporto getDestino() {
        return destino;
    }
  
    @Override
    public void decolar() {
        // Lógica para realizar a decolagem do avião
        System.out.println("Avião decolando...");
    }
  
    @Override
    public void pousar() {
        // Lógica para realizar o pouso do avião
        System.out.println("Avião pousando...");
    }
  
    @Override
    public void voar() {
        // Lógica para realizar o voo do avião
        System.out.println("Avião voando...");
    }
}
