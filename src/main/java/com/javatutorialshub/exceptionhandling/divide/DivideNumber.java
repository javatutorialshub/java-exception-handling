package com.javatutorialshub.exceptionhandling.divide;

public class DivideNumber {
    // Le mot clé throws indique que cette méthode déclare l'exception DivideNumberComputeException comme
    // une exception qu'elle lèvera en cas de problème
    public int compute(int a, int b) throws DivideNumberComputeException {
        try {
            return a / b;
        } catch (Throwable e) {
            String message = "Unable to divide a by b cause of: " + e.getMessage();
            // Ici nous créons une instance de la classe d'exception en indiquant un message contextuel clair et compréhensible
            // Puis nous utilisons l'exception mère comme paraètre du constructeur de cette instance afin de conserver
            // la hiérarchie des exception utile lors de l'affichage de la stack trace
            // le mot clé ici indique ici que nous levons cette exception
            throw new DivideNumberComputeException(message, e);
        }
    }
}
