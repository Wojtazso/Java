import ZadaniaLaby1.RunTuskslaby1;
import ZadaniaLaby2.RunTuskslaby2;
import ZadaniaLaby3.RunTuskslaby3;
import ZadaniaLaby4.RunTuskslaby4;

import java.util.Scanner;

public class WyborLabow {
    public void WyborLabowy() {
    int nr;
    Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Podaj numer Labolatoriow od 1 do 4");
            while (!scan.hasNextInt()) { //warunek sprawdzajacy poprawnosc podanych danych w tym przypadku czy sa to inty
                System.out.println("Wymagana liczba całkowita od 1 do 4, spróbuj ponownie.");
                scan.next();
            }
            nr = scan.nextInt();
            if (nr < 1 || nr > 4) {
                System.out.println("Nie ma takiego zadania sproboj ponownie");
            }
        } while (nr < 1 || nr > 4);

        switch (nr) {
            case 1:
                System.out.println("Zadania z Labolatoriów 1");
                RunTuskslaby1.RunTusklaby1();
                break;
            case 2:
                System.out.println("Zadania z Labolatoriów 2");
                RunTuskslaby2.RunTusklaby2();
                break;
            case 3:
                System.out.println("Zadania z Labolatoriow 3");
                RunTuskslaby3.RunTusklaby3();
                break;
            case 4:
                System.out.println("Zadania z Labolatoriow 4");
                RunTuskslaby4.Runtusklaby4();
                break;
            default:
                System.out.println("Nieoczekiwany błąd");
                break;


        }
    }
}
