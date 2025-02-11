public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "kovu", 5, true);
        Zoo myZoo = new Zoo("friguia", "Hammamet", 25, lion);

        System.out.println(myZoo.toString());
        //myZoo.displayZoo();


    }
}
