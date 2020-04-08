public class Ville
{
    private String nom;
    private double supperfie;
    private  int population;

    public Ville()
    {
        nom="inconnu";
        supperfie=0;
        population=0;
    }

    public Ville(String nom, double superficie, int pop)
    {
        this.nom=nom;
        this.supperfie = superficie;
        this.population=pop;
    }


    /////////////////////////////////GETTER
    public String getNom() {
        return nom;
    }

    public double getSupperfie() {
        return supperfie;
    }

    public int getPopulation() {
        return population;
    }

    ///////////////////////////////SETTER

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSupperfie(double supperfie) {
        this.supperfie = supperfie;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

}
