import java.util.Date;

public class Cadre extends Employe{
    private int indice;

    public Cadre(int matricule, String nom, String prenom, Date dateDeNaissance, int indice) {
        super(matricule, nom, prenom, dateDeNaissance);
        this.indice = indice;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    @Override
    public String toString() {
        return super.toString() + "indice= " + indice;
    }

    @Override
    public int getSalaire() {
        switch(this.indice){
            case 1: return 13000;
            case 2: return 15000;
            case 3: return 17000;
            case 4: return 20000;
            default: return 0;
        }
    }
}
