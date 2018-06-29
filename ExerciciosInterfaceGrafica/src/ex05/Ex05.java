
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
    private JTextField jTextField01, jTextField02;
    private JButton jButtonSomar, jButtonSubtrair, jButtonMultiplicar, jButtonDividir;
    private JTextArea jTextArea;
    private JScrollPane jScrollPane;

    public Ex05(JFrame jFrame, JLabel jLabelNumero01, JLabel jLabelNumero02, JTextField jTextField01, JTextField jTextField02, JButton jButtonSomar, JButton jButtonSubtrair, JButton jButtonMultiplicar, JButton jButtonDividir, JTextArea jTextArea, JScrollPane jScrollPane) {
        this.jFrame = jFrame;
        this.jLabelNumero01 = jLabelNumero01;
        this.jLabelNumero02 = jLabelNumero02;
        this.jTextField01 = jTextField01;
        this.jTextField02 = jTextField02;
        this.jButtonSomar = jButtonSomar;
        this.jButtonSubtrair = jButtonSubtrair;
        this.jButtonMultiplicar = jButtonMultiplicar;
        this.jButtonDividir = jButtonDividir;
        this.jTextArea = jTextArea;
        this.jScrollPane = jScrollPane;
    }
    
    
    public Ex05() {
        
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
    }

    @Override
    public void instanciarComponentes() {
    }

    @Override
    public void gerarLocalizacoes() {
    }

    @Override
    public void gerarDimencoes() {
    }
    
}
