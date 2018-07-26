package ex06;

import interfaces.JFrameBaseInterface;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex06 implements JFrameBaseInterface {
    
    private JLabel jLabelNome, jLabelPeso, jLabelAltura;
    private JTextField jTextFieldNome, jTextFieldPeso, jTextFieldAltura;
    private JButton jButtonIMC;
    private JFrame jFrame;
    
    public Ex06() {
        instanciarComponentes();
        gerarTela();
        gerarDimencoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoBotaoIMC();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
         jFrame = new JFrame("Exerício 06");
         jFrame.setSize(440, 370);
         jFrame.setLayout(null);
         jFrame.setLocationRelativeTo(null);
         jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         jFrame.getContentPane().setBackground(Color.decode("#7c8087"));
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jLabelPeso);
        jFrame.add(jLabelAltura);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldPeso);
        jFrame.add(jTextFieldAltura);
        jFrame.add(jButtonIMC);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jLabelNome.setFont(new Font("Romantic Beach", 0, 30));
        
        jLabelPeso = new JLabel("Peso");
        jLabelPeso.setFont(new Font("Romantic Beach", 0, 30));
        
        jLabelAltura = new JLabel("Altura");
        jLabelAltura.setFont(new Font("Romantic Beach", 0, 30));
        
        jTextFieldNome = new JTextField();
        jTextFieldPeso = new JTextField();
        jTextFieldAltura = new JTextField();
        jButtonIMC = new JButton("IMC");
        jButtonIMC.setFont(new Font("Romantic Beach", 1, 30));
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(20, 0);
        jTextFieldNome.setLocation(20, 55);
        
        jLabelPeso.setLocation(20, 100);
        jTextFieldPeso.setLocation(20, 155);
        
        jLabelAltura.setLocation(20, 200);
        jTextFieldAltura.setLocation(20, 255);
        
        jButtonIMC.setLocation(200, 130);
    }

    @Override
    public void gerarDimencoes() {
        jLabelNome.setSize(80, 80);
        jTextFieldNome.setSize(140, 30);
        
        jLabelPeso.setSize(80, 80);
        jTextFieldPeso.setSize(140, 30);
        
        jLabelAltura.setSize(80, 80);
        jTextFieldAltura.setSize(140, 30);
        
        jButtonIMC.setSize(200, 70);
        
    }
    
    private void acaoBotaoIMC() {
        jButtonIMC.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!verificarCampos()) {
                    return;
                }
                if (!verificarInformações()) {
                    return;
                }
                String nome = jTextFieldNome.getText();
                double peso = Double.parseDouble(jTextFieldPeso.getText());
                double altura = Double.parseDouble(jTextFieldAltura.getText());
                double imc = peso / (altura * altura);
                
                String classificação = "";
                if (imc >= 0 && imc <= 9.99) {
                    classificação = "Desnutrição Grau V";
                } else if (imc >= 10 && imc <= 12.9) {
                    classificação = "Desnutrição Grau IV";
                } else if (imc >= 13 && imc <= 15.9) {
                    classificação = "Desnutrição Grau III";
                } else if (imc >= 16 && imc <= 16.9) {
                    classificação = "Desnutrição Grau II";
                } else if (imc >= 17 && imc <= 18.4) {
                    classificação = "Desnutrição Grau I";
                } else if (imc >= 18.5 && imc <= 24.9) {
                    classificação = "Normal";
                } else if (imc >= 25 && imc <= 29.9) {
                    classificação = "Pré-obesidade";
                } else if (imc >= 30 && imc <= 34.5) {
                    classificação = "Obesidade Grau I";
                } else if (imc >= 35 && imc <= 39.9) {
                    classificação = "Obesidade Grau II";
                } else if (imc > 39.9) {
                    classificação = "Obesidade Grau III";
                }
                
                JOptionPane.showMessageDialog(null, 
                        "Olá, " + nome + "."
                        + "\nSeu peso: " + peso
                        + "\nSua altura: " + altura
                        + "\nIMC: " + imc
                        + "\nClassificação: " + classificação
                );
                
            }
        });
    }
    
    private boolean verificarCampos() {
        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O nome não foi informado!");
            jTextFieldNome.requestFocus();
            return false;
        }
        if (jTextFieldPeso.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O peso não foi informado!");
            jTextFieldPeso.requestFocus();
            return false;
        }
        if (jTextFieldAltura.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "A altura não foi informada!");
            jTextFieldAltura.requestFocus();
            return false;
        }
        return true;
    }
    
    private boolean verificarInformações() {
        try {
            double peso = Double.parseDouble(jTextFieldPeso.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O peso informado, é inválido!");
            return false;
        }
        try {
            double altura = Double.parseDouble(jTextFieldAltura.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "A altura informada, é inválida!");
            return false;
        }
        return true;
    }
    
    
    
    
}
