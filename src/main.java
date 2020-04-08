public class main {

    public static void main(String[] args) {

        //création des 5 objets de types villes
        Ville dijon = new Ville("Dijon", 40.41, 375831);
        Ville quetigny = new Ville("Quetigny", 8.19,9690);
        Ville beaune = new Ville("Beaune", 31.3,52741);
        Ville macon = new Ville("Mâcon", 27.0,100172);
        Ville chalon = new Ville("Chalon-sur-Saône", 15.22,133557);

        //création des 2 départements
        Departement CoteDor=new Departement(3,"Côte d'Or",21);
        Departement saoneEtLoire= new Departement(2,"Saône-et-Loire",71);

        //ajout des villes aux départements
        CoteDor.ajouterVille(dijon);
        CoteDor.ajouterVille(quetigny);
        CoteDor.ajouterVille(beaune);

        saoneEtLoire.ajouterVille(macon);
        saoneEtLoire.ajouterVille(chalon);

        //Affichage des villes
        System.out.println(dijon);

        //Affichage des départements
        System.out.println(CoteDor);
        System.out.println(saoneEtLoire);

    }


}
