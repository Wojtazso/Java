package ZadaniaLaby1;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import static java.lang.Math.sqrt;

public class ZadaniaLab1 {

    public  void zad1() {
        System.out.print("Program wyswietla wiek oraz imie.\n");
        double wiek = 22;
        String imie = "Wojciech";
        System.out.printf("Imie: "+imie+"\nWiek: "+wiek);
    }
    public void zad2(){
        System.out.print("Program liczy i wyswietla proste działania na liczbach.\n");
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj 1 liczbe:\n");
        double a = scan.nextDouble();
        System.out.print("Podaj 2 liczbe:\n");
        double b = scan.nextDouble();
        scan.close();

        System.out.printf("a = " + a + "\nb = " + b + "\n");
        System.out.printf("Suma: \n"+ a + " + " + b + " = " +  (a + b) + "\n");
        System.out.printf("Odejmowanie: \n"+a + " - " + b + " = " + (a - b) + "\n");

        if (b != 0) {
            System.out.print("Dzielenie: \n"+ a + " : " + b + " = " + (a / b) + "\n");
        } else {
            System.out.print("Nie mozna dzielic przez 0\n");
        }

    }
    protected   boolean zad3() {

        System.out.print("Program sprawdzajacy czy liczba jest parzysta.\n");
        System.out.print("Podaj liczbe:\n");
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        return (a % 2 == 0);

    }
    public  boolean zad4() {
        System.out.print("Program sprawdzajacy czy liczba jest podzielna przez 5 oraz 3 jednoczesnie.\n");
        System.out.print("Podaj liczbe:\n");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        return (a % 3 == 0 && a % 5 ==0);

    }
    public void zad5() {
        System.out.print("Program liczacy 3 potege dowolnej liczby.\n");
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj liczbe ktora bedzie podniesiona do 3 potegi:\n");
        double a = scan.nextDouble();
        System.out.printf(a+" do potegi 3 = "+(a*a*a));
    }
    public void zad6() {
        System.out.print("Program liczacy pierwiastek z liczby.\n");

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj liczbe:\n");
        double a = scan.nextDouble();
        System.out.print("Pierwiastek z "+ a +" = "+sqrt(a));
    }
    public  boolean zad7() {
        System.out.println("Podaj 2 liczby ktore beda przedziałem, z przedzialu bedzie losowane 3 liczby, sprawdzimy mozlowosci utworzenia z nich trojkota prostokatnego");
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj 1 liczbe:\n");
        double d = scan.nextDouble();
        System.out.print("Podaj 2 liczbe:\n");
        double e = scan.nextDouble();
        if(e>d){
            double a = ThreadLocalRandom.current().nextDouble(d,e);
            double b = ThreadLocalRandom.current().nextDouble(d,e);
            double c = ThreadLocalRandom.current().nextDouble(d,e);
            System.out.println("a = "+a+"\nb = "+b+"\nc = "+c);
            return ((a*a)+(b*b)==(c*c)||(c*c)+(b*b)==(a*a)||(a*a)+(c*c)==(b*b));}
        else if (e<d) {
            double a = ThreadLocalRandom.current().nextDouble(e,d);
            double b = ThreadLocalRandom.current().nextDouble(e,d);
            double c = ThreadLocalRandom.current().nextDouble(e,d);
            System.out.println("a = "+a+"\nb = "+b+"\nc = "+c);
            return ((a*a)+(b*b)==(c*c)||(c*c)+(b*b)==(a*a)||(a*a)+(c*c)==(b*b));}
        else{
            double a = ThreadLocalRandom.current().nextDouble(e,e);
            double b = ThreadLocalRandom.current().nextDouble(e,e);
            double c = ThreadLocalRandom.current().nextDouble(e,e);
            System.out.println("a = "+a+"\nb = "+b+"\nc = "+c);
            return ((a*a)+(b*b)==(c*c)||(c*c)+(b*b)==(a*a)||(a*a)+(c*c)==(b*b));
        }
    }
}



