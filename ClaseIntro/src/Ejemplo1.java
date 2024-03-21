/*import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo1 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        /* 
        int cedula = 123456789; //Un 
        short edad = 1024;
        System.out.println(cedula + (int)edad);
        System.out.println("Hola" + Integer.parseInt("1"));
        */
        //______________________________________________________________________
        
        //byte edad = scanner.nextByte();

        /* Ejercicio edad
        System.out.println("Cuantos años tienes?: ");
        if(edad < 18)
        {
            System.out.println("Estas menor");
        }
        else if(edad >=18 && edad < 30)
        {
            System.out.println("Estas Joven");
        }
        else
        {
            System.out.println("Estas cucho");
        }
        */
        //__________________________________________________________________
        /*Ejercicio Estrato
        byte estrato = scanner.nextByte();

        switch(estrato)
        {
            case 1: System.out.println("Recibiras mucha ayuda");
                break;
            case 2: System.out.println("Recibiras alguna ayuda");
                break;
            case 3: System.out.println("Recibiras una ayuda");
                break;
            case 4: System.out.println("No recibiras ayuda");
                break;
            case 5: System.out.println("No seas tacaño!");
                break;
            default: System.out.println("No es un estratovalido");
                break;
        }
        */

        // debuguear
        
        //int[]lista = {1,2,3,4,5};

        /* for generico de iteracion uno por uno
        for(int i = 0; i < lista.length; i++)
        {
            System.out.println(lista[i]);
        }
        */

        //for que imprime lista si iteraciones 
        //for(int valor:lista)
        //{
        //    System.out.println(valor);
        //}
        //imprimir una lista a lo numpy

        //System.out.println(Arrays.toString(lista));
    
        // puedo hacer que un bucle pare escribiendo break, o declarando la variable como el 
        //maximo del recorrido del for
        /*
            for (int i = 0; i < 5 i ++){
                if i = 3{
                    i = 5
                }
            }
         */
        //for(int i=lista.length-1; i >= 0; i--){
        //    System.out.println(lista[1]);
        //}
   // }
//}
//_____________________________EJEMPLO USANDO CLASES________________________________________________________

import java.util.ArrayList;

public class Ejemplo1 
{
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) throws Exception 
    {
        Persona gabriel = new Persona();
        gabriel.setNombre("Gabriel Uraza");
        gabriel.setTipoDocumento(TipoDocumento.CC);
        gabriel.setColorPelo(ColorPelo.Negro);

        Persona monica = new Persona();
        monica.setNombre("Monica Garcia");
        monica.setTipoDocumento(TipoDocumento.CC);
        monica.setColorPelo(ColorPelo.Negro);


        //ESTRUCUTRA DE DATOS: ArrayList

        ArrayList miLista = new ArrayList();
        miLista.add("Hola");
        miLista.add(1000);
        miLista.add('a');
        miLista.add(3.1416f);

        for(int i = 0; i < miLista.size(); i++)
        {
            System.out.println(miLista.get(i));
        }

        //comando remove "miLista.remove(index:0)"
    }
}
//Como reacciona el enum ante un input
// existen metodos islowwer