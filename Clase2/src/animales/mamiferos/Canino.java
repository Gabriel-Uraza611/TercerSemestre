package animales.mamiferos;

public class Canino extends Mamifero {
    private Boolean aullar;
    private String pedigree;
    private String lider;

    public Canino(Boolean aullar, String pedigree, String lider, String tipoSangre){
        super(tipoSangre);
        this.aullar = aullar;
        this.pedigree = pedigree;
        this.lider = lider;
    }

    public Boolean getAullar() {
        return aullar;
    }
    public void setAullar(Boolean aullar) {
        this.aullar = aullar;
    }
    public String getPedigree() {
        return pedigree;
    }
    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }
    public String getLider() {
        return lider;
    }
    public void setLider(String lider) {
        this.lider = lider;
    }
    
    
}
