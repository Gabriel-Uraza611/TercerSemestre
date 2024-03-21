//Extends es de heredar
//Cuando heredamos una clase en el constructor debe de ir dentro la abstraccion de la clase padre
// En este caso aullar, pedigree y lider, o sea tambien TIENE que tener esas carácteristicas
//this. se refiere a los nombres de la misma clase, el super(nombresCalsePadre) los nombres de la clase padre
//Sea cual sea que seleccione la persona se va a llamar de tipo generico <g>
// g quiere decir que no se sabe que tipo de variable es la variable, por eso es tipo g, es un posible tipo de var.
//hay que poner el generic en ambos lados
package animales.mamiferos;

public class Perro <g,t> extends Canino{

    private String nombre;
    private Raza raza;
    private g cedula;
    private t longitud;
    
    public Perro(t longitud, g cedula, String tipoSangre, Boolean aullar, String pedigree, String lider, String nombre, Raza raza){
        super(aullar, tipoSangre, pedigree, lider);
        this.nombre = nombre;
        this.raza = raza;
    } 
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Raza getRaza() {
        return raza;
    }
    public void setRaza(Raza raza) {
        this.raza = raza;
    }
    public g getCedula() {
        return cedula;
    }
    public void setCedula(g cedula) {
        this.cedula = cedula;
    }
    public t getLongitud() {
        return longitud;
    }
    public void setLongitud(t longitud) {
        this.longitud = longitud;
    }
    
}
