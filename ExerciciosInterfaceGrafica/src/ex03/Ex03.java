package ex03;

import ex01.JFrameBaseInterface;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex03 implements JFrameBaseInterface{
    
    private JFrame jFrame;
    private JLabel jLabelNumero, jLabelTabuada;
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
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jLabelTabuada);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonTabuada);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Número");
        jLabelTabuada = new JLabel("Tabuada");
        jTextFieldNumero = new JTextField();
        jButtonTabuada = new JButton("Tabuada");
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(10, 33);
    }

    @Override
    public void gerarDimencoes() {
        jLabelNumero.setSize(80, 20);
        jTextFieldNumero.setSize(80, 20);
    }
    
}
