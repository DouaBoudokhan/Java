
import java.util.Scanner; 
public class ZooManagement {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in); 
 int nbrCages;
 do {
 System.out.println("Enter nb de cages");
 while (!scanner.hasNextInt()){
 System.out.println("Enter nb de cages");
 scanner.next();}
 nbrCages = scanner.nextInt();
 }
 while (nbrCages<0);
 scanner.nextLine();
 System.out.println("Enter zoo name");
 String zooName = scanner.nextLine();

 System.out.println(zooName+" comporte "+nbrCages+" cages ");
 scanner.close();
 }
}