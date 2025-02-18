package tn.esprit.gestionzoo.entities;

public class Terrestre extends Animal {
    private int nbrLegs;

    public Terrestre() {}
    public Terrestre(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    // Getter
    public int getHabitat() {
        return nbrLegs;
    }

    // Setter
    public void setHabitat(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString(){
        return "Animal Terrestre: " + super.toString() + "\nNbrLegs: " + nbrLegs;
    }
}