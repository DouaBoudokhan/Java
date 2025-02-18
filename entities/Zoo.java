package tn.esprit.gestionzoo.entities;


public class Zoo {
    Animal[] animals;
    private String name;
    private String city;
    private final static int nbrCages = 25;
    private int count;

    public String getName(){
        return this.name;
    }
    public String getCity(){
        return this.city;
    }
    public int getCount(){
        return count;
    }

    public void setName(String name) {
        // Check if the name is not null or empty
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
        }
    }

    public void setCity(String city){
        this.city=city;
    }
    public void setCount(int count){
        this.count=count;
    }



    public Zoo(String name, String city, Animal animal) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        if (animal != null) {
            this.animals[0] = animal;
            count++;
        }

    }

    public boolean isZooFull() {
        return this.count >= nbrCages;
    }

    public boolean addAnimal(Animal animal) {
        if (animal == null) return false;

        // Check if animal already exists
        if (searchAnimal(animal) != -1) {
            return false;  // Animal already exists
        }

        // Check if zoo is full
        if (isZooFull()) {
            return false;
        }
        // Find first empty slot
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                count++;
                return true;
            }
        }
        return false;
    }


    public void displayZoo() {

        System.out.println("Nom du zoo: " + this.name);
        System.out.println("Ville du zoo: " + this.city);
        System.out.println("Nombre de cages: " + this.count);
        for (int i = 0; i < count; i++) {
            System.out.println(this.animals[i].getFamily());
            System.out.println(this.animals[i].getName());
            System.out.println(this.animals[i].getAge());
            System.out.println(this.animals[i].getIsMammal());
        }
    }


    public int searchAnimal(Animal animal) {
        if (animal == null) return -1;

        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            for (int i = index; i < count; i++) {
                animals[i] = animals[i+1];
            }
            count--;
            return true;
        }
        return false;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1 == null) return z2;
        if (z2 == null) return z1;
        return (z1.count >= z2.count) ? z1 : z2;
    }

    @Override
    public String toString() {
        return "Zoo: name: " + name + ", city: " + city + ", nbrCages: " + nbrCages;
    }
}
