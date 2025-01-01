public  class Comenzi{
    int id;
    String nume;
    int cantitate;
    double pret;
    public Comenzi(int id, String nume, int cantitate, double pret) {
        this.id = id;
        this.nume = nume;
        this.cantitate = cantitate;
        this.pret = pret;
    }
    public int getId() {
        return id;
    }
    public void calcId(int idn3) {
        double rezultat=cantitate*pret;
        System.out.println(rezultat);

    }

    public String toString() {
        return "ID-ul comenzii este: "+id+", numele: "+nume+", cantitate: "+cantitate+", pret: "+pret;
    }
}