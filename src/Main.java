import classeinterne.TypeContrôle;
import classeinterne.Ue;
import classeinterne.UeStatique;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //*********************************************** Non static + Anonyme + Lambda *******************************************************//

        /**
         *  ArrayList qui contient des modules d'une instance de classe avec des attributs non statique
         */
        System.out.println("Classe Non statique");
        ArrayList<Ue> listeUe = new ArrayList<>();

        /**
         * Initialiser une liste des classeinterne.Ue Non Statique avec differents module : Non statique
         */
        for(int i=0;i<1;i++){
            listeUe.add(new Ue("JAVA"+i,2000+i,"MIAGE"+i,"Dupont", TypeContrôle.QCM,true));
        }

        /**
         * Afficher liste
         */
        for(int i = 0; i< listeUe.size(); i++){
            System.out.println(listeUe.get(i).toString());
        }


        listeUe.forEach(ue-> {
            /**
             * Classe Non statique
             */
             //ue.new IncrementerAnnee();
             //ue.new IncrementerAnneeDupont();
             //ue.new SupprimerRattrapage();

            /**
             * classe local anonyme
             */
             //ue.new AnonymeIncrementerAnnee().AnonymeIncrementer();
             //ue.new AnonymeIncrementerAnneeDupont().AnonymeIncrementerDupont();
            /**
             * Classe Lambda
             */
                ue.new LambdaIncrementerAnnee().LambdaIncrementerAnnee();

        });

        /**
         * affichage
         */
        System.out.println("Apres traitement");
        for(int i = 0; i< listeUe.size(); i++){
            System.out.println(listeUe.get(i).toString());
        }

        //*********************************************** Statique *******************************************************//
        /**
         * statique
         */
        System.out.println("Classe Statique");
        ArrayList<UeStatique> listeUeStatique = new ArrayList<>();

        /**
         * Initialiser une liste des classeinterne.Ue Non Statique avec differents module : Non statique
         */
        for(int i=0;i<1;i++){
            listeUeStatique.add(new UeStatique("JAVA"+i,2000+i,"MIAGE"+i,"Dupont",TypeContrôle.QCM,true));
        }

        /**
         * Afficher liste
         */
        for(int i=0;i<listeUeStatique.size();i++){
            System.out.println(listeUeStatique.get(i).toString());
        }


        listeUeStatique.forEach(ue-> {

            /**
             * dans la class interne static on fait pas d'instance d'une nouvelle classe & la classe static aussi est detaché de la classe englobante
             */
            new UeStatique.IncrementerAnneeStatic();
            new UeStatique.IncrementerAnneeDupontStatic();
            new UeStatique.SupprimerRattrapageStatic();

        });

        /**
         * affichage
         */
        System.out.println("Apres traitement");
        for(int i=0;i<listeUeStatique.size();i++){
            System.out.println(listeUeStatique.get(i).toString());
        }






    }
}
