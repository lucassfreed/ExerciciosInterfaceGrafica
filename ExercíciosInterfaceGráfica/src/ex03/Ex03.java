package ex03;

import interfaces.JFrameBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ex03 implements JFrameBaseInterface {

    private JFrame jFrame;
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JTextArea jTextAreaTabuada;
    private JScrollPane jScrollPane;
    private JButton jButtonTabuada;

    public Ex03() {
        instanciarComponentes();
        gerarTela();
        gerarDimencoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoBotaoTabuada();
        configurarJScrollPane();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Exerício 03");
        jFrame.setSize(500, 415);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonTabuada);
        jFrame.add(jScrollPane);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField();
        jButtonTabuada = new JButton("Tabuada");
        jTextAreaTabuada = new JTextArea();
        jScrollPane = new JScrollPane();
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(10, 33);
        jButtonTabuada.setLocation(105, 33);
        jScrollPane.setLocation(210, 10);
    }

    @Override
    public void gerarDimencoes() {
        jLabelNumero.setSize(80, 20);
        jTextFieldNumero.setSize(80, 30);
        jButtonTabuada.setSize(80, 30);
        jScrollPane.setSize(240, 320);
    }

    public void acaoBotaoTabuada() {
        jButtonTabuada.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (jTextFieldNumero.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Você deve informar algum número.");
                    return;
                }
                
                String texto = "";
                long numero;
                try {
                    numero = Long.parseLong(jTextFieldNumero.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Você deve informar apenas números!");
                    return;
                }
                for (int i = 1; i <= 10; i++) {
                    texto += numero + " x " + i + " = " + (numero * i) + "\n";
                }
                jTextAreaTabuada.setText(texto);
            }
        });
    }
    
    private void configurarJScrollPane() {
        jScrollPane.setViewportView(jTextAreaTabuada);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jTextAreaTabuada.setLineWrap(true);
    }

}
