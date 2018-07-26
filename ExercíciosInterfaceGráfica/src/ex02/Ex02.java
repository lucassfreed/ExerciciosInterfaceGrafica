package ex02;

import interfaces.JFrameBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex02 implements JFrameBaseInterface {

    private JFrame jFrame;
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JButton jButtonTabuada;

    public Ex02() {
        instanciarComponentes();
        gerarTela();
        gerarDimencoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoBotaoTabuada();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Exerício 02");
        jFrame.setSize(250, 120);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonTabuada);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField();
        jButtonTabuada = new JButton("Tabuada");
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(10, 30);
        jButtonTabuada.setLocation(90, 15);
    }

    @Override
    public void gerarDimencoes() {
        jLabelNumero.setSize(80, 20);
        jTextFieldNumero.setSize(70, 30);
        jButtonTabuada.setSize(100, 45);
    }

    private void acaoBotaoTabuada() {
        jButtonTabuada.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (jTextFieldNumero.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Você deve informar algum número.");
                    return;
                }
                long numero;
                try {
                    numero = Long.parseLong(jTextFieldNumero.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Você deve informar apenas números!");
                    return;
                }
                String texto = "";
                for (int i = 1; i <= 10; i++) {
                    texto += numero + " x " + i + " = " + (numero * i)+ "\n";
                }
                JOptionPane.showMessageDialog(null, "Tabuada:\n" + texto);

            }
        });
    }

}
