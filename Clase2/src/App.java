/* Todo lo que este en minusculas son carpetas, por ejemplo java.swing es una carpeta y dentro esta JOptionPane
(o sea formato .java)
por convencion directorios en minusculas, nombres de archivos de Java en mayuscula.

Yo puedo crear mis porpios (paquetes) o sea directorios, los archivos java si yo uso otro directorios deben
tener el nombre de la libreria al comienzo del codigo asi (package "nombredeldirectorio")
*/
import java.util.ArrayList;

import animales.mamiferos.Canino;
import animales.mamiferos.Perro;
import animales.mamiferos.Raza;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Creacion de objeto perro
        // el <> NO FUNCIONA CON LAS VARIABLES DE LAS PRIMITIVAS
        // Para asignar un objeto dentro de otro objeto podemos crear el objeto y luego
        //asignarlo dentro del ctor del objeto perro ( aqui en el main)
        //DownCasting: Asignarle a una clase padre puede ser igual a cualquiera de sus hijos
        // lO que esta arriba de la gerarquia puede tener lo de sus hijos porque ellos suplen con
        // las variables que el padre requiere

        Perro <Short, Double> Juan = new  Perro <Short, Double>(
            (Double)1.3212731753,(short) 123, "o+", true,
            "DogChau","Ninguno","Axel", Raza.FrenchPoodle);

        Canino canino = new Canino(true, "medio", "balto", "o+" );


        Canino canino2 = new  Perro <Short, Double>(
            (Double)1.3212731753,(short) 123, "o+", true,
            "DogChau","Ninguno","Axel", Raza.FrenchPoodle);

        //Anotaciones o Decoraciones
        // Puede ser funcional o no funcional
        // No funcional, no afectan al codigo, son solo informativas
        // Funcional, si tienen impacto al ejecutar el codigo
        //@Override: Informativo

        ArrayList <Canino> listaCaninos = new ArrayList<Canino>();
        //Puedo agregar perros, porque los perros son caninos pero no mamiferos
        listaCaninos.add(canino);
        listaCaninos.add(canino2);
        listaCaninos.add(Juan);

        // .getclass me muestra el tipo de clas,e en el caso de hacerlo con un for seria por ejemplo 
        //CaninoFor.getClass()
    }
}


