package ZadaniaLaby2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ZadaniaLab2 {

    public void zad1() {
        Scanner scan = new Scanner(System.in);
        double lPkt, suma = 0;
        int a = 0;
        System.out.println("Podaj ilosc studentów");
        int n = scan.nextInt();
        int ile_stud = n;
        if (n < 0) System.out.println("liczba studentow w grupie nie moze byc < 0!");
        else {
            while (n > 0) {
                System.out.println("Podaj ilosc punktow dla studenta " + (a + 1) + " z przedzialu [0,10]: ");
                lPkt = scan.nextDouble();
                if (lPkt >= 0 && lPkt <= 10) {
                    suma += lPkt;
                    n--;
                    a++;
                } else {
                    System.out.println("Podaj wartosc jeszcze raz");
                }
            }
            double srednia = suma / ile_stud;
           // double srednia1 =Math.round(srednia*10000.0)/10000.0;(ilosc zer przed przecinkiem oznacza ilsoc miejsc zaokraglanych)
            String sredzak=String.format("%.2f", srednia);//dokladnosc po przecinku (math.round tez mozna zaokraogla do liczby calkowitej, dokladnosc rowniez mozna okrelisc jak w c jezyku )
            System.out.println("Średnia ilosc pkt: " + sredzak);
           // System.out.println("witam witam"+srednia1);


        }
    }

    public void zad2() {
        System.out.println("Program wczytuje 10 liczb i wyznaczeniu ilości oraz sumy liczb ujemnych i dodatnich podanych przez użytkownika");
        Scanner scan = new Scanner(System.in);
        int n = 1, iloscu = 0, iloscd = 0;
        double sumd = 0, sumu = 0, liczbal;

        for (int i = 1; i < 11; i++) {
            System.out.println("podaj element nr " + n);
            n++;
            liczbal = scan.nextDouble();
            if (liczbal >= 0) {
                iloscd++;
                sumd += liczbal;
            } else {
                iloscu++;
                sumu += liczbal;
            }

        }
        System.out.println("ilosc dodatnich ele =" + iloscd + "\nsuma dodatnich ele = " + sumd + "\nilosc ele ujemnych = " + iloscu + "\n suma ele ujemnych = " + sumu);
    }

    public void zad3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Program wyswietla sume wszystkich licz parzystych w danym ciagu");
        System.out.println("Podaj ilu wyrazowy jest ciag n");
        int n = scan.nextInt();
        int sumap = 0;

        if (n > 0) {
            for (int i = 1; i <= n; i++) {

                if (i % 2 == 0) {
                    sumap += i;
                }
            }
        } else {
            System.out.println("N jest mniejsze od zera");
        }
        System.out.println("Suma wyrazów parzystych ciagu wynosi: " + sumap);
    }

    public void zad4() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Program sluzy do losowania licz z przedzialu (-10,45)");
        System.out.println("Podaj ilosc liczb do wylosowania.");
        int n = scan.nextInt();
        double suma=0;

        for(int i=1;i<=n;i++){
            int a =ThreadLocalRandom.current().nextInt(-9,44);//-9 oraz 44 bo jest otwarty czyli bez -10 oraz 45
            if(a % 2 == 0) {
                System.out.println("a = "+a);
                suma += a;
            }
        }
        System.out.println(" suma wylosowanych parzystych liczb = "+suma);

    }

        public void zad5(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Program sluzy do sprawdzania czy slowo jest palindronem.");

            System.out.println("Podaj słowo ktore ma byc sprawdzane:");
            String slowo = scan.next();

            StringBuilder odwrotne = new StringBuilder(slowo);
            odwrotne.reverse();

            String odwr = odwrotne.toString();

            System.out.println("Podales słowo: "+slowo);
            System.out.println("Jego odwrotnosc to: "+odwr);
    if(odwr.equalsIgnoreCase(slowo)) //odwr.equals(slowo) porównuje zawartość dwóch obiektów typu String, a nie ich adresy w pamięci
    {
        System.out.println("Wyraz jest palindronem");
    }
    else {
        System.out.println("nie jest palindronem");
        }

    }
}