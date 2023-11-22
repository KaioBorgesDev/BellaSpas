package com.example.classes;


import com.example.interfaces.Atividades;

public class Estetica extends classes.Paciente implements Atividades {
    private static final int MAX_SERVICOS = 3;
    private String[] servicos;

    public Estetica(String nome, String telefone, String sexo, String tipoAtividade) {
        super(nome, telefone, sexo, tipoAtividade);
        this.servicos = new String[MAX_SERVICOS];
    }

    @Override
    public String toString() {
        return "Estetica: " +super.toString();
    }

    public String[] realizarServico(String servico1) {
        servicos[0] = servico1;
        return servicos;
    }

    public String[] realizarServico(String servico1, String servico2) {
        servicos[0] = servico1;
        servicos[1] = servico2;
        return servicos;
    }

    public String[] realizarServico(String servico1, String servico2, String servico3) {
        servicos[0] = servico1;
        servicos[1] = servico2;
        servicos[2] = servico3;
        return servicos;
    }

    @Override
    public String caminharBosque() {
        return null;
    }

    @Override
    public String nadarPiscina() {
        return null;
    }

    @Override
    public String exercitarAcademia() {
        return null;
    }
}
