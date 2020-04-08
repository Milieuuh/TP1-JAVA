public class Departement {
    //attributs
    private Ville tabVilles[];
    private int numero;
    private String nom;
    private int nbVillesSaisies;

    //constructor
    public Departement()
    {
        this.nom="";
        this.numero=0;
        this.tabVilles=null;
        this.nbVillesSaisies=0;
    }
    public Departement(int nbVilles,String nom, int numero)
    {
        this.tabVilles=new Ville[nbVilles];
        this.nom=nom;
        this.numero=numero;
        this.nbVillesSaisies=0;
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
            System.out.println("Attention ! VOus ne pouvez plus rajouter de ville.");
        }
    }

    public String toString()
    {
        String s="Ville du département "+nom+" :\n";
        for(int i=0;i<tabVilles.length;i++)
        {
            s+=tabVilles[i].toString()+"\n";
        }

        return s;
    }
}


