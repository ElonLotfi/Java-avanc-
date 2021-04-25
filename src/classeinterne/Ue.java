package classeinterne;

public class Ue {

    private String nom;
    private  int annéeCreation;
    private String nomDiplome;
    private  String nomEnseignant;
    private  TypeContrôle typeContrôle;
    private  Boolean rattrapage;


    public Ue(String nom, int annéeCreation, String nomDiplome, String nomEnseignant, TypeContrôle typeContrôle, Boolean rattrapage) {
        this.nom = nom;
        this.annéeCreation = annéeCreation;
        this.nomDiplome = nomDiplome;
        this.nomEnseignant = nomEnseignant;
        this.typeContrôle = typeContrôle;
        this.rattrapage = rattrapage;
    }

    @Override
    public String toString() {
        return "classeinterne.Ue{" +
                "nom='" + nom + '\'' +
                ", annéeCreation=" + annéeCreation +
                ", nomDiplome='" + nomDiplome + '\'' +
                ", nomEnseignant='" + nomEnseignant + '\'' +
                ", typeContrôle=" + typeContrôle +
                ", rattrapage=" + rattrapage +
                '}';
    }

    /**
     * Membre non statique :Incrémenter d’une année la propriété « Année de création », pour l’ensemble des modules.
     */
    public class IncrementerAnnee {
        public IncrementerAnnee(){
            annéeCreation+=1;
        }
    }

    /**
     * Membre non statique : Incrémenter d’une année la propriété « Année de création » lorsque l’enseignant est « Dupont ».
     */
    public class IncrementerAnneeDupont{
        public IncrementerAnneeDupont(){
            if(nomEnseignant.equals("Dupont")){
                annéeCreation+=1;
            }
        }
    }

    /**
     * Membre non statique : Supprimer le rattrapage éventuellement prévu si le type de contrôle associé est un QCM.
     */
    public class SupprimerRattrapage{
        public SupprimerRattrapage(){
            if (typeContrôle.equals(TypeContrôle.QCM)){
                rattrapage = false;
            }
        }
    }

    /**
     * class Anonyme : Incrémenter d’une année la propriété « Année de création », pour l’ensemble des modules.
     */

    public class AnonymeIncrementerAnnee{
        public void AnonymeIncrementer(){

            Incrementer increment = new Incrementer() {
                public void incrementer() {
                    annéeCreation++;
                }
                public void incrementerDupont() {
                }
            };
            increment.incrementer();
        }

    }

    /**
     * class Anonyme : Incrémenter d’une année la propriété « Année de création » lorsque l’enseignant est « Dupont »
     */
    public class AnonymeIncrementerAnneeDupont{
        public void AnonymeIncrementerDupont(){

            Incrementer increment = new Incrementer() {
                public void incrementer() {
                }
                public void incrementerDupont() {
                    if(nomEnseignant.equals("Dupont")){
                        annéeCreation++;

                    }
                }
            };
            increment.incrementerDupont();
        }

    }


    /**
     * Lambda : une seule méthode dans l'interface + syntaxe différente
     */


    public class LambdaIncrementerAnnee{
        public void LambdaIncrementerAnnee(){

            IncrementerLambda increment = () -> {
                annéeCreation++;
            };

            increment.incrementer();
        }

    }
}




