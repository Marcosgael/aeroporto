/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leogo
 */
public abstract class Aeronave {

    private int id;
    private String modelo;
    private String identificacao;
    private boolean asaFixa;
    private boolean helicoptero;
    private TremDePouso tremDePouso;

//    public Aeronave(int id, String modelo, String identificacao, boolean asaFixa, boolean helicoptero) {
    public Aeronave(int id, String modelo, String identificacao, boolean asaFixa, TremDePouso tremDePouso) {
        this.id = id;
        this.modelo = modelo;
        this.identificacao = identificacao;
        this.asaFixa = asaFixa;
        this.helicoptero = helicoptero;
        this.tremDePouso = tremDePouso;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public boolean isAsaFixa() {
        return asaFixa;
    }

    public boolean isHelicoptero() {
        return helicoptero;
    }

//    public TremDePouso getTremDePouso() {
//        return tremDePouso;
//    }
    public abstract void decolar();

    public abstract void pousar();

    public abstract void voar();
}
