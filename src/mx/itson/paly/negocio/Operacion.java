/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.paly.negocio;

/**
 * Contiene métodos para trabajar con tipos de dato String y Boolean.
 * @author Jose Manuel Leyva Munguia
 */
public class Operacion {
    
    /**
      * Convierte una cadena de texto a minúsculas y remueve espacios y signos de puntuación.
      * @param frase Cadena de texto que será limpiada.
      * @return Cadena de texto limpia.
      */
    public static String limpiarFrase(String frase) {
        
        String fraseLimpia = frase.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
				.replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "").replace("!","")
                                .replace("¡","").replace("¿", "").replace("?", "");
        return fraseLimpia;
        
    }
    
    /**
      * Determina si una cadena de texto es un palíndromo o no.
      * @param frase Cadena de texto que se probará.
      * @return Valor del tipo true o false.
      */
    public static boolean esPalindromo(String frase) {
        
        //Se eliminan los caracteres no deseados de la frase.
        String fraseLimpia = limpiarFrase(frase);
        //Convierte la cadena con la frase limpia en un array de caracteres.
        char[] caracteres = fraseLimpia.toCharArray();
        
        //Se inicializan las variables que serán índices para recorrer el array. Inicio apunta al primer caracter y fin apunta al último.
        int inicio = 0;
        int fin = caracteres.length - 1;
        
        while (inicio < fin) {
            //Si el carácter en la posición inicio no es igual al carácter en la posición fin, la frase no es un palíndromo.
            if (caracteres[inicio] != caracteres[fin]) {
                return false;
            }
            //Se incrementa inicio y fin para mover los índices hacia el centro de la frase y seguir comparando.
            inicio++;
            fin--;
        }
        //Si no hay diferencias entre los caracteres, significa que la frase es un palíndromo.
        return true;
        
    }
    
}
