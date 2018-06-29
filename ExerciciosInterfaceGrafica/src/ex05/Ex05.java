package ex05;

import ex01.JFrameBaseInterface;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex05 implements JFrameBaseInterface {

    private JFrame jFrame;
    private JLabel jLabelNumero01, jLabelNumero02;
    private JTextField jTextFieldNumero01, jTextFieldNumero02;
    private JButton jButtonSomar, jButtonSubtrair, jButtonMultiplicar, jButtonDividir;
    private JTextArea jTextAreaResultado;
    private JScrollPane jScrollPaneResultado;

    public Ex05() {
        instanciarComponentes();
        gerarTela();
        gerarDimencoes();
        gerarLocalizacoes();
        adicionarComponentes();
        configurarJScrollPane();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 415);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero01);
        jFrame.add(jLabelNumero02);
        jFrame.add(jTextFieldNumero01);
        jFrame.add(jTextFieldNumero02);
        jFrame.add(jButtonSomar);
        jFrame.add(jButtonSubtrair);
        jFrame.add(jButtonMultiplicar);
        jFrame.add(jButtonDividir);
        jFrame.add(jTextAreaResultado);
        jFrame.add(jScrollPaneResultado);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero01 = new JLabel("Número 1");
        jLabelNumero02 = new JLabel("Número 2");
        jTextFieldNumero01 = new JTextField();
        jTextFieldNumero02 = new JTextField();
        jButtonSomar = new JButton();
        jButtonSubtrair = new JButton();
        jButtonMultiplicar = new JButton();
        jButtonDividir = new JButton();
        jTextAreaResultado = new JTextArea();
        jScrollPaneResultado = new JScrollPane();
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero01.setLocation(10, 10);
        jTextFieldNumero01.setLocation(10, 30);
        jLabelNumero02.setLocation(10, 65);
        jTextFieldNumero02.setLocation(10, 85);
        jScrollPaneResultado.setLocation(170, 10);
    }

    @Override
    public void gerarDimencoes() {
        jLabelNumero01.setSize(80, 20);
        jTextFieldNumero01.setSize(90, 30);
        jLabelNumero02.setSize(80, 20);
        jTextFieldNumero02.setSize(90, 30);
        jScrollPaneResultado.setSize(300, 300);
        
    }
    
    private void configurarJScrollPane() {
        jScrollPaneResultado.setViewportView(jTextAreaResultado);
        jScrollPaneResultado.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPaneResultado.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jTextAreaResultado.setLineWrap(true);
    }

}
