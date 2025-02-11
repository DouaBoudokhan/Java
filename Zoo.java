
public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    Zoo(String name, String city, int nbrCages, Animal animal) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
        this.animals[0] = animal;

    }

    void displayZoo(){
        System.out.println("Nom du zoo: " + this.name);
        System.out.println("Ville du zoo: " + this.city);
        System.out.println("Nombre de cages: " + this.nbrCages);

        boolean verif = false;
        int i = 0;
        while (!verif && i < this.nbrCages) {
            if (this.animals[i] != null) {
                System.out.println(this.animals[i].toString());
            } else {
                verif = true;
            }
            i++;
        }
    }

    @Override
    public String toString(){
        return "Zoo: name: " +name+", city: " +city+", nbtCages: " +nbrCages;
    }
}
