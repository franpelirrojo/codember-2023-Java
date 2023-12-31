package retos;

import java.util.Scanner;

/*
Tu tarea es crear un mini compilador que interprete y ejecute programas escritos
en este lenguaje de símbolos.

Las operaciones del lenguaje son las siguientes:
    "#" Incrementa el valor numérico en 1.
    "@" Decrementa el valor numérico en 1.
    "*" Multiplica el valor numérico por sí mismo.
    "&" Imprime el valor numérico actual.

El valor numérico inicial es 0 y las operaciones deben aplicarse en elorden en que
aparecen en la cadena de símbolos.
** Ejemplos de entrada: **
Entrada: "##*&"
Salida esperada: "4"
Explicación: Incrementa (1), incrementa (2), multiplica (4), imprime (4).

Entrada: "&##&*&@&"
Salida esperada: "0243"
Explicación: Imprime (0), incrementa (1), incrementa (2), imprime (2), multiplica (4), imprime (4), decrementa (3), imprime (3).
 */

public class SegundoReto {
    public static void main(String[] args) {
        String line = new Scanner(System.in).next();
        String result = "";
        int counter = 0;

        for (char character : line.toCharArray()){
            switch (character){
                case '#' -> counter++;
                case '@' -> counter--;
                case '*' -> counter = counter*counter;
                case '&' -> result = result.concat(String.valueOf(counter));
            }
        }

        System.out.println(result);
    }
}
