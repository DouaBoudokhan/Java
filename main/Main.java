package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Terrestre;
import tn.esprit.gestionzoo.entities.Aquatique;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;

public class Main {
    public static void main(String[] args) {
        // Create some animals
        Animal lion1 = new Animal("Felidae", "Kovu", 5, true);
        Animal lion2 = new Animal("Felidae", "Simba", 5, true);  // Same name as lion1
        Animal tiger = new Animal("Felidae", "Raja", 4, true);

        // Create a zoo
        Zoo myZoo = new Zoo("Friguia", "Hammamet", lion1);

        // Test adding animals
        System.out.println("Adding lion1: " + myZoo.addAnimal(lion1));
        System.out.println("Adding lion2: " + myZoo.addAnimal(lion2));
        System.out.println("Adding tiger: " + myZoo.addAnimal(tiger));

        // Display zoo contents
        System.out.println("\nZoo contents after adding animals:");
        myZoo.displayZoo();

        // Test searching for animals
        System.out.println("\nTesting searchAnimal method:");
        System.out.println("Searching for lion1: " + myZoo.searchAnimal(lion1));
        System.out.println("Searching for tiger: " + myZoo.searchAnimal(tiger));

        // Test removing an animal
        System.out.println("\nTesting removeAnimal method:");
        System.out.println("Removing lion1: " + myZoo.removeAnimal(lion1));  // Should return true

        // Display zoo contents after removal
        System.out.println("\nZoo contents after removing lion1:");
        myZoo.displayZoo();

        // Test zoo comparison
        Zoo anotherZoo = new Zoo("Wildlife", "Safari", tiger);
        System.out.println("\nComparing zoos:");
        Zoo biggerZoo = Zoo.comparerZoo(myZoo, anotherZoo);
        System.out.println("Bigger zoo is: " + biggerZoo.toString());

        //instantiation
        Aquatique aqua= new Aquatique();
        Penguin penguin= new Penguin("Delphinidae","batri9",10,false,"Polar",500);
        Dolphin dolphin= new Dolphin("Spheniscidae","dolph",2,true,"Marine",60);

        System.out.println("\nthe penguin and the dolphin information");
        System.out.println(penguin.toString());
        System.out.println(dolphin.toString()+"\n");

        aqua.swim();
        penguin.swim();
        dolphin.swim();

    }
}