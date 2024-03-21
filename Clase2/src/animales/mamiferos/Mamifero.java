//escribir final al lado de la caracteristica (private, protected, public ) para definir ese valor
// peromanentemente para que sea inmutable
package animales.mamiferos;

public class Mamifero {
    protected final boolean mamanLeche = true;
    private String tipoSangre;

    public Mamifero(String tipoSangre) {
        
    }
    public String getTipoSangre() {
        return tipoSangre;
    }
    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    } 
}
