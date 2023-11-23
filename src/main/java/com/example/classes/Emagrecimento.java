package com.example.classes;


import com.example.interfaces.Atividades;

public class Emagrecimento extends Paciente implements Atividades {
    private double peso;
    private double altura;
    private double pesoIdeal;
    classes.CalculoPeso calculoPeso = new classes.CalculoPeso();

    public Emagrecimento(String nome, String telefone, String sexo, String tipoAtividade, double peso, double altura) {
        super(nome, telefone, sexo, tipoAtividade);
        this.peso = peso;
        this.altura = altura;
        this.pesoIdeal = calculoPeso.pesoIdeal(altura, sexo);
    }


    @Override
    public String toString() {
        return  "\nEmagracimento\n" + super.toString() + "\nO peso: " + this.peso;
    }

    @Override
    public String caminharBosque() {
        return "Realizando caminhada no bosque para emagrecimento.";
    }

    @Override
    public String nadarPiscina() {
        return "Realizando natação na piscina para emagrecimento.";
    }

    @Override
    public String exercitarAcademia() {
        return "Fazendo exercícios na academia para emagrecimento.";
    }
}
