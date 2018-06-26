
import ex01.Ex01;
import ex01.JFrameBaseInterface;
import ex02.Ex02;
import ex03.Ex03;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Exercicios implements JFrameBaseInterface{
    
    private JFrame jFrame;
    private JButton jButtonEx01;
    private JButton jButtonEx02;
    private JButton jButtonEx03;
    private JButton jButtonEx04;
    private JButton jButtonEx05;
    private JButton jButtonEx06;
    private JButton jButtonEx07;
    private JButton jButtonEx08;
    private JButton jButtonEx09;
    
    public Exercicios() {
        instanciarComponentes();
        gerarTela();
        gerarDimencoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoJButton01();
        acaoJButton02();
        acaoJButton03();
        acaoJButton04();
        acaoJButton05();
        acaoJButton06();
        acaoJButton07();
        acaoJButton08();
        acaoJButton09();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jButtonEx01);
        jFrame.add(jButtonEx02);
        jFrame.add(jButtonEx03);
        jFrame.add(jButtonEx04);
        jFrame.add(jButtonEx05);
        jFrame.add(jButtonEx06);
        jFrame.add(jButtonEx07);
        jFrame.add(jButtonEx08);
        jFrame.add(jButtonEx09);
    }

    @Override
    public void instanciarComponentes() {
        jButtonEx01 = new JButton("Ex. 01");
        jButtonEx02 = new JButton("Ex. 02");
        jButtonEx03 = new JButton("Ex. 03");
        jButtonEx04 = new JButton("Ex. 04");
        jButtonEx05 = new JButton("Ex. 05");
        jButtonEx06 = new JButton("Ex. 06");
        jButtonEx07 = new JButton("Ex. 07");
        jButtonEx08 = new JButton("Ex. 08");
        jButtonEx09 = new JButton("Ex. 09");

    }

    @Override
    public void gerarLocalizacoes() {
        jButtonEx01.setLocation(10, 10);
        jButtonEx02.setLocation(120, 10);
        jButtonEx03.setLocation(230, 10);
        jButtonEx04.setLocation(340, 10);
        jButtonEx05.setLocation(10, 120);
        jButtonEx06.setLocation(120, 120);
        jButtonEx07.setLocation(230, 120);
        jButtonEx08.setLocation(340, 120);
        jButtonEx09.setLocation(10, 230);
    }

    @Override
    public void gerarDimencoes() {
        jButtonEx01.setSize(100, 100);
        jButtonEx02.setSize(100, 100);
        jButtonEx03.setSize(100, 100);
        jButtonEx04.setSize(100, 100);
        jButtonEx05.setSize(100, 100);
        jButtonEx06.setSize(100, 100);
        jButtonEx07.setSize(100, 100);
        jButtonEx08.setSize(100, 100);
        jButtonEx09.setSize(100, 100);
    }

    public void acaoJButton01() {
        jButtonEx01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ex01();
            }
        });
    }

    public void acaoJButton02() {
        jButtonEx02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ex02();
            }
        });
    }

    public void acaoJButton03() {
        jButtonEx03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ex03();
            }
        });
    }

    public void acaoJButton04() {
        jButtonEx04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton05() {
        jButtonEx05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton06() {
        jButtonEx06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton07() {
        jButtonEx07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton08() {
        jButtonEx08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton09() {
        jButtonEx09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
    
}
