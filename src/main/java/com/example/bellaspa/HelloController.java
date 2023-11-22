package com.example.bellaspa;

import com.example.classes.Estetica;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class HelloController {

    @FXML
    private TextField alturas;

    @FXML
    private TextField nomes;

    @FXML
    private Pane painelCadastrar;

    @FXML
    private Pane painelServico;
    @FXML
    private Pane painelPeso;

    @FXML
    private TextField pesos;

    @FXML
    private TextField sexos;

    @FXML
    private TextField telefones;

    @FXML
    private TextField respostaServicos;

    @FXML
    private TextField tipoAtividades;
    @FXML
    private Label status;


    @FXML
    void btCadastrar(ActionEvent event) {
        painelPeso.setVisible(false);
        painelServico.setVisible(true);
        Set<classes.Paciente> pacientes = new HashSet<>();
        String nome = nomes.getText();
        String telefone = telefones.getText();
        String sexo = sexos.getText();
        String tipo = tipoAtividades.getText();


        Estetica estetica = new Estetica(nome, telefone, sexo, tipo);

        String respostaServico = respostaServicos.getText();
        switch (respostaServico) {
            case "1":
                estetica.realizarServico(JOptionPane.showInputDialog("Qual serviço?"));
                break;
            case "2":
                estetica.realizarServico(JOptionPane.showInputDialog("Qual serviço?"), JOptionPane.showInputDialog("Qual serviço?"));
                break;
            case "3":
                estetica.realizarServico(JOptionPane.showInputDialog("Qual serviço?"), JOptionPane.showInputDialog("Qual serviço?"), JOptionPane.showInputDialog("Qual serviço?"));
                break;
        }
        pacientes.add(estetica);




        status.setText("Usuario Cadastrado Com Sucesso!");
    }

    @FXML
    void jmiCadastrar(ActionEvent event) {
        painelCadastrar.setVisible(true);

    }
}
