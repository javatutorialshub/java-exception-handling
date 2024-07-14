package com.javatutorialshub.exceptionhandling;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ArithmeticExceptionExample {

    private static final Logger log = Logger.getLogger(ArithmeticExceptionExample.class.getName());

    public static void main(String[] args){
        int status = 0;
        try {
            // Le bloc try est exécuté en premier. Du moins, la machine essai d'exécuter ce bloc
            int a = 1;
            int b = 7;
            int x = a / b;
            log.log(Level.INFO, "Result = " + x);
        } catch (Exception e) {
            // La machine arrete aussitot l'exécution du bloc try lorsqu'une exception survient et se met à exécuter le bloc catch
            // Qui est en fin de compte le bloc réservé au comportement du programme lorsqu'une exceptiuon survient: Traitement de l'exception
            log.log(Level.SEVERE, "Unable to divide a by b: " + e.getMessage());
            status = -1;
        } finally {
            // Le bloc finally (qui est optionnel) est tout le temps exécuté lorsqu'il est présent. Son execution se fera soit à la suite du bloc try (lorsqu'aucune exception ne survient)
            // Soit à la suite du catch en cas d'exception
            System.exit(status);
        }
    }
}
