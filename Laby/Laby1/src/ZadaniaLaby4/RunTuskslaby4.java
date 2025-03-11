package ZadaniaLaby4;


import java.util.Scanner;

public class RunTuskslaby4 {
    public static void Runtusklaby4(){

        Scanner scan = new Scanner(System.in);// funkcja "scanf"
        int nr;
        do {
            System.out.println("Podaj numer zadania od 1 do 7:");


            while (!scan.hasNextInt()) { //warunek sprawdzajacy poprawnosc podanych danych w tym przypadku czy sa to inty
                System.out.println("Wymagana liczba całkowita od 1 do 7, spróbuj ponownie.");
                scan.next();
            }

            nr = scan.nextInt();
            if (nr < 1 || nr >7 ) {
                System.out.println("Nie ma takiego zadania sproboj ponownie");
            }

        } while (nr < 1 || nr >7 );

        switch (nr) {
            case 1:
                System.out.println("1.Zadanie:");
                ZadaniaLab4 task1 = new ZadaniaLab4(); //nazwa klasy
                task1.zad1(); // nazwa funkcji w klasie
                break;
            case 2:
                System.out.println("2.Zadanie: ");
                ZadaniaLab4 task2 = new ZadaniaLab4();
                task2.zad2();
                break;
            case 3:
                System.out.println("3.Zadanie:");
                ZadaniaLab4 task3 = new ZadaniaLab4();
                task3.zad3();
                break;
            case 4:
                System.out.println("4.Zadanie:");
                ZadaniaLab4 task4 = new ZadaniaLab4();
                task4.zad4();
                break;
            case 5:
                System.out.println("5.Zadanie:");
                ZadaniaLab4 task5 = new ZadaniaLab4();
                task5.zad5();
                break;
            case 6:
                System.out.println("6.Zadanie:");
                ZadaniaLab4 task6 = new ZadaniaLab4();
                task6.zad6();
                break;
            case 7:
                System.out.println("7.Zadanie:");
                ZadaniaLab4 task7 = new ZadaniaLab4();
                task7.zad7();
                break;
            default:
                System.out.println("Nieoczekiwany błąd.");
                break;

        }
        scan.close();


    }
}

