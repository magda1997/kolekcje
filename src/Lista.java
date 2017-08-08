import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Lista {

    private List<Integer> lista;
    private Set<Integer> listaBezPowtorzen;


    public Lista() {
        lista = new ArrayList<>();
        listaBezPowtorzen = new HashSet<>();
    }

    public void dodajElement(Integer dodawanaLiczba) {
        lista.add(dodawanaLiczba);
    }

    public void usun(Integer dodawanaLiczba) {
        lista.remove(dodawanaLiczba);
    }

    public void wyswietl() {
        for (Integer liczby : lista) {
            System.out.print(" " + liczby);
        }
        System.out.println();
    }

    public void wyswetlWodwrotnejKolejnosci() {
        System.out.print("Lista liczb w odwrotnej kolejnosci to: ");
        Collections.reverse(lista);
        for (Integer liczby : lista) {
            System.out.print(liczby);
        }
        System.out.println();
    }

    public void pisz() {
        System.out.println("rozmiar wynosi " + lista.size());
        System.out.println("Przechowywanie lista to : " + lista);

    }

    public boolean znajdz(Integer dodawanaLiczba) {
        System.out.println("Sprawdz czy lista zawiera liczbe" + dodawanaLiczba);
        return lista.contains(dodawanaLiczba);
    }

    public void zapiszDoPliku() throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("Dane.txt");
        for (Integer liczba : lista) {
            printWriter.print(liczba);
        }
        printWriter.close();
    }

    public void usunWszystkiePowtorzenia() {
        listaBezPowtorzen.addAll(lista);
        for (Integer liczby : listaBezPowtorzen) {
            System.out.print(liczby);
        }
    }
}



