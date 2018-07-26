package ex05;

import interfaces.JFrameBaseInterface;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex05 implements JFrameBaseInterface {

    private JFrame jFrame;
    private JLabel jLabelNumero01, jLabelNumero02, jLabelResultado;
    private JTextField jTextFieldNumero01, jTextFieldNumero02;
    private JButton jButtonSomar, jButtonSubtrair, jButtonMultiplicar, jButtonDividir;
    private JTextArea jTextAreaResultado;
    private JScrollPane jScrollPaneResultado;
    
    private static int numero1;
    private static int numero2;
    private static int resultado;

    public Ex05() {
        instanciarComponentes();
        gerarTela();
        gerarDimencoes();
        gerarLocalizacoes();
        adicionarComponentes();
        configurarJScrollPane();
        acaoBotaoSomar();
        acaoBotaoSubtrair();
        acaoBotaoMultiplicar();
        acaoBotaoDivisão();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Exerício 05");
        jFrame.setSize(295, 370);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.getContentPane().setBackground(Color.decode("#7c8087"));
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero01);
        jFrame.add(jLabelNumero02);
        jFrame.add(jLabelResultado);
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
        jTextFieldNumero01 = new JTextField();
        
        jLabelNumero02 = new JLabel("Número 2");
        jTextFieldNumero02 = new JTextField();
        
        jLabelResultado = new JLabel("Resultado");
        jScrollPaneResultado = new JScrollPane();
        jTextAreaResultado = new JTextArea();
        
        jButtonSomar = new JButton("+");
        jButtonSomar.setFont(new Font("Times New Roman", 0, 30));
        
        jButtonSubtrair = new JButton("-");
        jButtonSubtrair.setFont(new Font("Times New Roman", 0, 30));
        
        jButtonMultiplicar = new JButton("x");
        jButtonMultiplicar.setFont(new Font("Times New Roman", 0, 30));
        
        jButtonDividir = new JButton("÷");
        jButtonDividir.setFont(new Font("Times New Roman", 0, 30));
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero01.setLocation(10, 10);
        jTextFieldNumero01.setLocation(10, 30);
        jLabelNumero02.setLocation(10, 65);
        jTextFieldNumero02.setLocation(10, 85);
        jLabelResultado.setLocation(170, 10);
        jScrollPaneResultado.setLocation(170, 35);
        jButtonSomar.setLocation(10, 160);
        jButtonSubtrair.setLocation(90, 160);
        jButtonMultiplicar.setLocation(10, 240);
        jButtonDividir.setLocation(90, 240);
    }

    @Override
    public void gerarDimencoes() {
        jLabelNumero01.setSize(80, 20);
        jTextFieldNumero01.setSize(90, 30);
        jLabelNumero02.setSize(80, 20);
        jTextFieldNumero02.setSize(90, 30);
        jLabelResultado.setSize(90, 30);
        jScrollPaneResultado.setSize(100, 100);
        jButtonSomar.setSize(70, 70);
        jButtonSubtrair.setSize(70, 70);
        jButtonMultiplicar.setSize(70, 70);
        jButtonDividir.setSize(70, 70);
        
    }
    
    private void acaoBotaoSomar() {
        jButtonSomar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!verificarCampos()) {
                    return;
                }
                if (!verificarNúmerosInformados()){
                    return;
                }
                
                resultado = numero1 + numero2;
                jTextAreaResultado.setText(String.valueOf(resultado));
                
            }
        });
    }
    
    private void acaoBotaoSubtrair() {
        jButtonSubtrair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!verificarCampos()) {
                    return;
                }
                if (!verificarNúmerosInformados()){
                    return;
                }
                
                resultado = numero1 - numero2;
                jTextAreaResultado.setText(String.valueOf(resultado));
                
            }
        });
    }
    
    private void acaoBotaoMultiplicar() {
        jButtonMultiplicar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!verificarCampos()) {
                    return;
                }
                if (!verificarNúmerosInformados()){
                    return;
                }
                
                resultado = numero1 * numero2;
                jTextAreaResultado.setText(String.valueOf(resultado));
                
            }
        });
    }
    
    private void acaoBotaoDivisão() {
        jButtonDividir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!verificarCampos()) {
                    return;
                }
                if (!verificarNúmerosInformados()){
                    return;
                }
                
                resultado = numero1 / numero2;
                jTextAreaResultado.setText(String.valueOf(resultado));
                
            }
        });
    }
    
    private void configurarJScrollPane() {
        jScrollPaneResultado.setViewportView(jTextAreaResultado);
        jScrollPaneResultado.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPaneResultado.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jTextAreaResultado.setLineWrap(true);
        jTextAreaResultado.setEditable(false);
    }
    
    private boolean verificarCampos() {
        if (jTextFieldNumero01.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O número 1 não foi informado!");
            jTextFieldNumero01.requestFocus();
            return false;
        }
        if (jTextFieldNumero02.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O número 2 não foi informado!");
            jTextFieldNumero02.requestFocus();
            return false;
        }
        return true;
    }
    
    private boolean verificarNúmerosInformados() {
        try {
            numero1 = Integer.parseInt(jTextFieldNumero01.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O número 1 é inválido!");
            jTextFieldNumero01.requestFocus();
            return false;
        }
        try {
            numero2 = Integer.parseInt(jTextFieldNumero02.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O número 2 é inválido!");
            return false;
        }
        return true;
    }

}
