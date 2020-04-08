public class Departement {
    //attributs
    private Ville tabVilles[];
    private int numero;
    private String nom;
    private int nbVillesSaisies=0;

    //constructor
    public Departement()
    {

    }
    public Departement(int nbVilles,String nom, int numero)
    {
        this.tabVilles=new Ville[nbVilles];
        this.nom=nom;
        this.numero=numero;
    }

    public void ajouterVille(Ville ville)
    {
        if(nbVillesSaisies< tabVilles.length)
        {
            tabVilles[nbVillesSaisies]=ville;
            nbVillesSaisies++;

        }
        else
        {
            System.out.println("Attention ! VOus ne pouvez plus rajouter de ville.")
        }
    }

    public void toString()
    {
        System.out.println("Ville du département "+nom+" :");
        for(int i=0;i<tabVilles.length;i++)
        {
            tabVilles[i]
        }
    }
}


