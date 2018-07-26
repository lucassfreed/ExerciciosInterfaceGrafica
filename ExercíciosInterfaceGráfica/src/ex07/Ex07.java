package ex07;

import interfaces.JFrameBaseInterface;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex07 implements JFrameBaseInterface {
    
    private JLabel jLabelNome,
            jLabelQuantidadeHoras,
            jLabelValorINSS, 
            jLabelContribuicaoSindical, 
            jLabelValorPasse, 
            jLabelAuxilioAlmoco,
            jLabelAuxilioEducacao,
            jLabelAuxilioSaude,
            jLabelResultado,
            jLabelCargo;
    
    private JTextField jTextFieldNome,
            jTextFieldQuantidadeHoras,
            jTextFieldValorINSS,
            jTextFieldContribuicaoSindical,
            jTextFieldValorPasse,
            jTextFieldAuxilioAlmoco,
            jTextFieldAuxilioEducacao,
            jTextFieldAuxilioSaude;
    
    private JTextArea jTextAreaResultado;
    private JComboBox jComboBoxCargo;
    private JButton jButtonProcessar;
    private JFrame jFrame;
    
    public Ex07() {
        instanciarComponentes();
        gerarTela();
        gerarDimencoes();
        gerarLocalizacoes();
        adicionarComponentes();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Exerício 07");
        jFrame.setSize(700, 700);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.getContentPane().setBackground(Color.decode("#7c8087"));
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jTextFieldNome);
        jFrame.add(jLabelQuantidadeHoras);
        jFrame.add(jTextFieldQuantidadeHoras);
        jFrame.add(jLabelValorINSS);
        jFrame.add(jTextFieldValorINSS);
        jFrame.add(jLabelContribuicaoSindical);
        jFrame.add(jTextFieldContribuicaoSindical);
        jFrame.add(jLabelValorPasse);
        jFrame.add(jTextFieldValorPasse);
        jFrame.add(jLabelAuxilioAlmoco);
        jFrame.add(jTextFieldAuxilioAlmoco);
        jFrame.add(jLabelAuxilioEducacao);
        jFrame.add(jTextFieldAuxilioEducacao);
        jFrame.add(jLabelAuxilioSaude);
        jFrame.add(jTextFieldAuxilioSaude);
        jFrame.add(jTextAreaResultado);
        jFrame.add(jLabelResultado);
        jFrame.add(jLabelCargo);
        jFrame.add(jComboBoxCargo);
        jFrame.add(jButtonProcessar);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jLabelNome.setFont(new Font("Romantic Beach", 0, 30));
        jTextFieldNome = new JTextField();
        
        jLabelQuantidadeHoras = new JLabel("Quantidade de Horas");
        jLabelQuantidadeHoras.setFont(new Font("Romantic Beach", 0, 30));
        jTextFieldQuantidadeHoras = new JTextField();
        
        jLabelValorINSS = new JLabel("Valor do INSS");
        jLabelValorINSS.setFont(new Font("Romantic Beach", 0, 30));
        jTextFieldValorINSS = new JTextField();
        
        jLabelContribuicaoSindical = new JLabel("Contribuição Sindical");
        jLabelContribuicaoSindical.setFont(new Font("Romantic Beach", 0, 30));
        jTextFieldContribuicaoSindical = new JTextField();
        
        jLabelValorPasse = new JLabel("Valor do Passe");
        jLabelValorPasse.setFont(new Font("Romantic Beach", 0, 30));
        jTextFieldValorPasse = new JTextField();
        
        jLabelAuxilioAlmoco = new JLabel ("Auxílio Almoço");
        jLabelAuxilioAlmoco.setFont(new Font("Romantic Beach", 0, 30));
        jTextFieldAuxilioAlmoco = new JTextField();
        
        jLabelAuxilioEducacao = new JLabel("Auxílio Educação");
        jLabelAuxilioEducacao.setFont(new Font("Romantic Beach", 0, 30));
        jTextFieldAuxilioEducacao = new JTextField();
        
        jLabelAuxilioSaude = new JLabel("Auxílio Saúde");
        jLabelAuxilioSaude.setFont(new Font("Romantic Beach", 0, 30));
        jTextFieldAuxilioSaude = new JTextField();
        
        jTextAreaResultado = new JTextArea();
        
        jLabelResultado = new JLabel("Resultado");
        jLabelResultado.setFont(new Font("Romantic Beach", 0, 30));
        
        jLabelCargo = new JLabel("Cargo");
        jLabelCargo.setFont(new Font("Romantic Beach", 0, 30));
        
        jComboBoxCargo = new JComboBox();
        
        jButtonProcessar = new JButton("Processar");
        jButtonProcessar.setFont(new Font("Romantic Beach", 0, 30));
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(20, 0);
        jTextFieldNome.setLocation(20, 55);
        
        jLabelQuantidadeHoras.setLocation(20, 70);
        jTextFieldQuantidadeHoras.setLocation(20, 125);
        
        jLabelValorINSS.setLocation(20, 140);
        jTextFieldValorINSS.setLocation(20, 195);
        
        jLabelContribuicaoSindical.setLocation(20, 210);
        jTextFieldContribuicaoSindical.setLocation(20, 265);
        
        jLabelValorPasse.setLocation(20, 280);
        jTextFieldValorPasse.setLocation(20, 335);
        
        jLabelAuxilioAlmoco.setLocation(20, 350);
        jTextFieldAuxilioAlmoco.setLocation(20, 405);
        
        jLabelAuxilioEducacao.setLocation(20, 420);
        jTextFieldAuxilioEducacao.setLocation(20, 475);
        
        jLabelAuxilioSaude.setLocation(20, 490);
        jTextFieldAuxilioSaude.setLocation(20, 545);
        
        jLabelResultado.setLocation(20, 490);
        
    }

    @Override
    public void gerarDimencoes() {
        jLabelNome.setSize(80, 80);
        jTextFieldNome.setSize(140, 30);
        
        jLabelQuantidadeHoras.setSize(300, 80);
        jTextFieldQuantidadeHoras.setSize(140, 30);
        
        jLabelValorINSS.setSize(300, 80);
        jTextFieldValorINSS.setSize(140, 30);
        
        jLabelContribuicaoSindical.setSize(300, 80);
        jTextFieldContribuicaoSindical.setSize(140, 30);
        
        jLabelValorPasse.setSize(300, 80);
        jTextFieldValorPasse.setSize(140, 30);
        
        jLabelAuxilioAlmoco.setSize(300, 80);
        jTextFieldAuxilioAlmoco.setSize(140, 30);
        
        jLabelAuxilioEducacao.setSize(300, 80);
        jTextFieldAuxilioEducacao.setSize(140, 30);
        
        jLabelAuxilioSaude.setSize(300, 80);
        jTextFieldAuxilioSaude.setSize(140, 30);
        
        jLabelResultado.setSize(300, 80);
        
    }
    
    private void acaoBotaoProcessar() {
        jButtonProcessar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                
            }
        });
    }
}
