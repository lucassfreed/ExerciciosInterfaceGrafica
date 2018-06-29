
package ex04;

import ex01.JFrameBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex04 implements JFrameBaseInterface {
    
    private JFrame jFrame;
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JButton jButtonVerificar;
    
    public Ex04() {
        instanciarComponentes();
        gerarTela();
        gerarDimencoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoBotaoVericar();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(190, 120);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jButtonVerificar);
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
    }

    @Override
    public void instanciarComponentes() {
        jButtonVerificar = new JButton();
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField();
        jButtonVerificar.setIcon(new ImageIcon(getClass().getResource
        ("/Icons/list.png")));
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(10, 30);
        jButtonVerificar.setLocation(100, 15);
    }

    @Override
    public void gerarDimencoes() {
        jLabelNumero.setSize(80, 20);
        jTextFieldNumero.setSize(80, 30);
        jButtonVerificar.setSize(59, 59);
    }
    
    public void acaoBotaoVericar() {
        jButtonVerificar.addActionListener(new ActionListener() {

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
                
                String texto = numero + " é um número ";
                
                if ((numero % 2) == 0) {
                    texto += "par";
                } else {
                    texto += "ímpar";
                }
                
                texto += " e ";
                
                if (numero < 0) {
                    texto += "negativo";
                } else if (numero > 0) {
                    texto += "positivo";
                } else {
                    texto += "neutro";
                }
                
                JOptionPane.showMessageDialog(null, texto);
            }
        });
    }
    
    
}
