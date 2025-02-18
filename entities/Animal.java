package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public String getFamily(){
        return family;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean getIsMammal(){
        return isMammal;
    }

    public void setFamily(String family){
        this.family = family;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if (age <0){
            System.out.println("Invalid age");
        }else{
            this.age = age;}
    }
    public void setIsMammal(boolean isMammal){
        this.isMammal = isMammal;
    }

    public Animal(){}
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString(){
        return "Animal: family: " + family +", name: " + name +", age: " + age +", isMammal: " + isMammal;
    }


}

