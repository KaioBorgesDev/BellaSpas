package com.example.classes;

public class Servico {
    Paciente paciente;
    private String nome;
    private String[] servicos;

    public Servico() {
    }

    public Servico(String nome, String[] servicos) {
        this.nome = paciente.getNome();
        this.servicos = servicos;
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
}
