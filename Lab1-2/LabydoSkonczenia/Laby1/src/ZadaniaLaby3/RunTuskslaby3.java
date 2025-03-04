package ZadaniaLaby3;
import ZadaniaLaby3.Zadania;
import java.util.Scanner;

public class RunTuskslaby3 {
    public static void RunTusklaby3() {
        Scanner scan = new Scanner(System.in);// funkcja "scanf"
        int nr;
        do {
            System.out.println("Podaj numer zadania od 1 do 5:");


            while (!scan.hasNextInt()) { //warunek sprawdzajacy poprawnosc podanych danych w tym przypadku czy sa to inty
                System.out.println("Wymagana liczba całkowita od 1 do 5, spróbuj ponownie.");
                scan.next();
            }

            nr = scan.nextInt();
            if (nr < 1 || nr >5 ) {
                System.out.println("Nie ma takiego zadania sproboj ponownie");
            }

        } while (nr < 1 || nr >5 );

        switch (nr) {
            case 1:
                System.out.println("1.Zadanie:");
                Zadania task1 = new Zadania(); //nazwa klasy
                task1.zad1(); // nazwa funkcji w klasie
                break;
            case 2:
                System.out.println("2.Zadanie: ");
                Zadania task2 = new Zadania();
                task2.zad2();
                break;
            case 3:
                System.out.println("3.Zadanie:");
                Zadania task3 = new Zadania();
                task3.zad3();
                break;
            case 4:
                System.out.println("4.Zadanie:");
                Zadania task4 = new Zadania();
                task4.zad4();
                break;
            case 5:
                System.out.println("5.Zadanie:");
                Zadania task5 = new Zadania();
                task5.zad5();
                break;
            default:
                System.out.println("Nieoczekiwany błąd.");
                break;

        }
        scan.close();


    }

}

