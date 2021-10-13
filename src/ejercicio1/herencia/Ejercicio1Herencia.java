package ejercicio1.herencia;

import Animal.entidades.Animal;
import Animal.entidades.Caballo;
import Animal.entidades.Gato;
import Animal.entidades.Perro;

public class Ejercicio1Herencia {

    public static void main(String[] args) {

        Animal Perro = new Perro("Roger", "Pollo", 6, "Bulldog");
        Perro.Alimentarse();
        Animal Gato = new Gato("Nacha", "Pescado ", 2, "Siames");
        Gato.Alimentarse();
        Animal Caballo=new Caballo("Milenio", "Afrecho",5, "Meztizo");
        Caballo.Alimentarse();
    }
    

}
