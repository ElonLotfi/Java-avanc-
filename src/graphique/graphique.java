package graphique;

import classeinterne.TypeContrôle;
import classeinterne.Ue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class graphique {
    private JButton Traitement1;
    private JButton Traitement2;
    private JButton Traitement3;
    private JTextArea text;
    private JPanel jpanel;

    public graphique() {

        /**
         *          Exemple Non statique
         *          Initialiser ArrayListe
         */
        ArrayList<Ue> listeUe = new ArrayList<>();
        for(int i=0;i<10;i++){
            listeUe.add(new Ue("JAVA"+i,2000+i,"MIAGE"+i,"Dupont", TypeContrôle.QCM,true));
        }

        Traitement1.addActionListener(new ActionListener() {
            StringBuffer txt= new StringBuffer();
            @Override
            public void actionPerformed(ActionEvent e) {
                listeUe.forEach(ue-> {
                    ue.new IncrementerAnnee();
                    txt.append(ue.toString()+"\n");

                });
                text.append(txt.toString());


            }
        });

        Traitement2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                StringBuffer txt= new StringBuffer();
                listeUe.forEach(ue-> {
                    ue.new IncrementerAnneeDupont();

                    txt.append(ue.toString()+"\n");
                });

                text.append(txt.toString());

            }
        });

        Traitement3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuffer txt= new StringBuffer();
                listeUe.forEach(ue-> {
                    ue.new SupprimerRattrapage();
                    txt.append(ue.toString()+"\n");

                });


                text.append(txt.toString());
            }
        });
    }

    public static void main (String[] args){
        JFrame jFrame = new JFrame("App");
        jFrame.setContentPane(new graphique().jpanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
