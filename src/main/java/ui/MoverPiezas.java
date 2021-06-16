package ui;


import modelo.Caballo;
import modelo.Contexto;
import modelo.Reina;
import modelo.Torre;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MoverPiezas extends JFrame {

    private JPanel contentPane;

    public MoverPiezas(Contexto contexto) {
        setBackground(Color.DARK_GRAY);
        setTitle("Ajedrez ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(Color.LIGHT_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton CaballoNewButton = new JButton("Caballo");
        CaballoNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contexto.setEstrategia(new Caballo());
                contexto.ejecutarEstrategia();
                JOptionPane.showMessageDialog(null, "Se ha movido al caballo");
            }
        });
        CaballoNewButton.setBackground(Color.DARK_GRAY);
        CaballoNewButton.setForeground(Color.WHITE);
        CaballoNewButton.setBounds(160, 61, 89, 23);
        contentPane.add(CaballoNewButton);

        JButton ReinaNewButton_1 = new JButton("Reina");
        ReinaNewButton_1.setBackground(Color.DARK_GRAY);
        ReinaNewButton_1.setForeground(Color.WHITE);
        ReinaNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                contexto.setEstrategia(new Reina());
                contexto.ejecutarEstrategia();
                JOptionPane.showMessageDialog(null, "Se ha movido a la reina");
            }
        });
        ReinaNewButton_1.setBounds(160, 108, 89, 23);
        contentPane.add(ReinaNewButton_1);

        JButton TorreNewButton_2 = new JButton("Torre");
        TorreNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contexto.setEstrategia(new Torre());
                contexto.ejecutarEstrategia();
                JOptionPane.showMessageDialog(null, "Se ha movido a la torre");
            }
        });
        TorreNewButton_2.setBackground(Color.DARK_GRAY);
        TorreNewButton_2.setForeground(Color.WHITE);
        TorreNewButton_2.setBounds(160, 159, 89, 23);
        contentPane.add(TorreNewButton_2);

        JLabel ElijaPiezaNewLabel = new JLabel("Seleccione la pieza que desee mover:");
        ElijaPiezaNewLabel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 17));
        ElijaPiezaNewLabel.setBounds(10, 21, 300, 14);
        contentPane.add(ElijaPiezaNewLabel);
    }
}
