public class Main {
    public static void main(String[] args){
        System.out.println("Witaj, program służy do pokazywania rozwiazań zadań z Labolatoriów z programowania obiektowego.\nWybierz numer labolatoriów, następnie numer zadania.");
        System.out.println("Po wybraniu zadania zostanie wyświetlona treść zadania, program wyświetli czego potrzebuje, nastepnie wynik zadania lub sam wynik zadania bez podawnia danych.");

        WyborLabow run = new WyborLabow();
        run.WyborLabowy();
    }
}
