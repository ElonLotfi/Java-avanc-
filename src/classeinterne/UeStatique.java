package classeinterne;

public class UeStatique {

    private String nom;
    private static int annéeCreation;
    private String nomDiplome;
    private static String nomEnseignant;
    private static TypeContrôle typeContrôle;
    private static Boolean rattrapage;


    public UeStatique(String nom, int annéeCreation, String nomDiplome, String nomEnseignant, TypeContrôle typeContrôle, Boolean rattrapage) {
        this.nom = nom;
        this.annéeCreation = annéeCreation;
        this.nomDiplome = nomDiplome;
        this.nomEnseignant = nomEnseignant;
        this.typeContrôle = typeContrôle;
        this.rattrapage = rattrapage;
    }

    @Override
    public String toString() {
        return "classeinterne.UeStatique{" +
                "nom='" + nom + '\'' +
                ", annéeCreation=" + annéeCreation +
                ", nomDiplome='" + nomDiplome + '\'' +
                ", nomEnseignant='" + nomEnseignant + '\'' +
                ", typeContrôle=" + typeContrôle +
                ", rattrapage=" + rattrapage +
                '}';
    }


    /**
     * Membre statique : Static : peut pas acceder aux variable de la classe englobante
     * pour utiliser les attribut de la classe englobante dans cette classe interne static faut mettre les attribut qu'on veut les utiliser de la classe englobante en static
     */

    public static class IncrementerAnneeStatic{

        public IncrementerAnneeStatic(){
            annéeCreation+=1;

        }

    }
    /**
     * Membre statique : Incrémenter d’une année la propriété « Année de création » lorsque l’enseignant est « Dupont »
     */

    public static class IncrementerAnneeDupontStatic{

        public IncrementerAnneeDupontStatic(){
            if(nomEnseignant.equals("Dupont")){
                annéeCreation+=1;
            }
        }
    }

    /**
     * Membre statique : Supprimer le rattrapage éventuellement prévu si le type de contrôle associé est un QCM.
     */
    public static class SupprimerRattrapageStatic{

        public SupprimerRattrapageStatic(){
            if (typeContrôle.equals(TypeContrôle.QCM)){
                rattrapage = false;
            }
        }

    }



}

