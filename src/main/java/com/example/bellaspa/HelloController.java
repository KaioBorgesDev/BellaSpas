package com.example.bellaspa;

import com.example.classes.Estetica;
import com.example.classes.Paciente;
import com.example.classes.Servico;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

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
    private Pane paneServico;

    @FXML
    private TextField pesos;

    @FXML
    private AnchorPane paneCadastro;

    @FXML
    private TextField sexos;

    @FXML
    private TextField tfServico;

    @FXML
    private TextField tfServico1;

    @FXML
    private TextField tfServico2;

    @FXML
    private TextField telefones;

    @FXML
    private TextField tipoAtividades;

    @FXML
    private Label status;

    @FXML
    private Label lbServ;

    @FXML
    private Label lbServ1;

    @FXML
    private TextField respostaServicos;

    @FXML
    private Label lbServ2;

    private Set<Paciente> pacientes = new HashSet<>();
    private Servico servico = new Servico();
    private Servico servicos;

    @FXML
    void btCadastrarEstetica(ActionEvent event) {
        String nome = nomes.getText();
        String telefone = telefones.getText();
        String sexo = sexos.getText();
        String tipo = tipoAtividades.getText();

        paneServico.setVisible(true);
        String respostaServico = respostaServicos.getText();

        Estetica estetica = new Estetica(nome, telefone, sexo, tipo);

        switch (respostaServico) {
            case "1":
                lbServ.setVisible(true);
                tfServico.setVisible(true);
                String servicinho = tfServico.getText();

                String[] servico1 = servico.realizarServico(servicinho);
                System.out.println(servico1);
                servicos = new Servico(nome, servico1);
                break;
            case "2":
                lbServ.setVisible(true);
                lbServ1.setVisible(true);
                tfServico.setVisible(true);
                tfServico1.setVisible(true);

                String[] servico2 = servico.realizarServico(tfServico.getText(), tfServico1.getText());
                servicos = new Servico(nome, servico2);
                break;
            case "3":
                lbServ.setVisible(true);
                lbServ1.setVisible(true);
                lbServ2.setVisible(true);
                tfServico.setVisible(true);
                tfServico1.setVisible(true);
                tfServico2.setVisible(true);

                String[] servico3 = servico.realizarServico(tfServico.getText(), tfServico1.getText(), tfServico2.getText());
                servicos = new Servico(nome, servico3);
                break;
        }

        pacientes.add(estetica);
        System.out.println(pacientes);
        System.out.println(servicos);
        status.setText("Usuario Cadastrado Com Sucesso!");
    }

    @FXML
    void btCadastrarEmagracimento(ActionEvent event) {
        // Implemente o código conforme necessário
    }

    @FXML
    void jmiCadastrarEstetica(ActionEvent event) {
        painelCadastrar.setVisible(true);
        paneCadastro.setVisible(true);
        painelPeso.setVisible(false);
        painelServico.setVisible(true);
    }

    @FXML
    void jmiCadastrarEmagrecimento(ActionEvent event) {
        paneServico.setVisible(false);
        painelCadastrar.setVisible(true);
        paneCadastro.setVisible(true);
        painelPeso.setVisible(true);
        painelServico.setVisible(false);
    }

    @FXML
    void jmiQuit(ActionEvent event) {
        paneCadastro.setVisible(false);
    }
}
