/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase10jun;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Sant Garcia
 */
public class Clase10Jun {
    /**
     * @param args the command line arguments
     */
    public static void leerRegistros() {
        try // lee registros del archivo, usando el objeto Scanner
        {
            double sumG = 0;            
            double sumH = 0;
            double promG = 0;
            double promH = 0;
            int contador = 0;
            Scanner tabla = new Scanner(new File("datos/tabula.csv"));
            
            while (tabla.hasNext()) {
                contador = contador +1;
                String tab = tabla.nextLine();
                
                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(tab.split("\\|")));
               
                //Transformacion de String a Double
                double goles = Double.parseDouble(linea_partes.get(11));
                double height = Double.parseDouble(linea_partes.get(9));
                // Suma de Goles
                sumG = goles + sumG;
                sumH = height + sumH;
            } // fin de while
            // Promedio de Goles y de Altura
            promG = sumG/contador;
            promH = sumH/contador;
        System.out.printf("El promedio de goles es: %.2f\n",promG);
        System.out.printf("El promedio de altura es: %.2f\n",promH);
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    
}
