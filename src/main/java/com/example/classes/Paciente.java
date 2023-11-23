package com.example.classes;

public abstract class Paciente {
    protected String nome;
    protected String telefone;
    protected String sexo;
    protected String tipoAtividade;


    public Paciente(String nome, String telefone, String sexo, String tipoAtividade) {
        this.nome = nome;
        this.telefone = telefone;
        this.sexo = sexo;
        this.tipoAtividade = tipoAtividade;
    }
    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nTelefone: " + telefone
                +"\nSexo: " + sexo
                + "\nTipoAtividade: " + tipoAtividade;
        }

    public String getNome() {
        return nome;
    }
}

