package ex01;

import interfaces.JFrameBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex01 implements JFrameBaseInterface {

    private JFrame jFrame;
    private JLabel jLabelNome, jLabelSobrenome;
    private JTextField jTextFieldNome, jTextFieldSobrenome;
    private JButton jButtonConcatenar;

    public Ex01() {
        instanciarComponentes();
        gerarTela();
        gerarDimencoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoBotaoConcatenar();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Exerício 01");
        jFrame.setSize(375, 240);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jLabelSobrenome);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldSobrenome);
        jFrame.add(jButtonConcatenar);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jLabelSobrenome = new JLabel("Sobrenome");
        jTextFieldNome = new JTextField();
        jTextFieldSobrenome = new JTextField();
        jButtonConcatenar = new JButton("Concatenar");

    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(10, 10);
        jLabelSobrenome.setLocation(170, 10);
        jTextFieldNome.setLocation(10, 35);
        jTextFieldSobrenome.setLocation(170, 35);
        jButtonConcatenar.setLocation(85, 100);
    }

    @Override
    public void gerarDimencoes() {
        jLabelNome.setSize(70, 20);
        jLabelSobrenome.setSize(70, 20);
        jTextFieldNome.setSize(150, 30);
        jTextFieldSobrenome.setSize(180, 30);
        jButtonConcatenar.setSize(150, 80);
    }

    public void acaoBotaoConcatenar() {
        jButtonConcatenar.addActionListener(new ActionListener() {
            String nome;
            String sobrenome;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (jTextFieldNome.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "O nome deve ser informado!");
                    return;
                }

                if (jTextFieldSobrenome.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "O sobrenome deve ser informado!");
                    return;
                }

                nome = jTextFieldNome.getText();
                sobrenome = jTextFieldSobrenome.getText();
                JOptionPane.showMessageDialog(null, "Nome: " + nome
                        + "\nSobrenome: " + sobrenome);
            }
        });
    }

}
