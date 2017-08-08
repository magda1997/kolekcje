import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by Magda on 04.08.2017.
 */
public class Main {
    public static void main(String args[]) throws FileNotFoundException {
        Lista lista = new Lista();
        Integer liczby = new Integer(3);
        Integer liczby1 = new Integer(2);
        Integer liczby2 = new Integer(4);
        Integer liczby3 = new Integer(3);
        Integer liczby4 = new Integer(2);
        lista.dodajElement(liczby);
        lista.dodajElement(liczby1);
        lista.dodajElement(liczby2);
        lista.dodajElement(liczby3);
        lista.dodajElement(liczby4);
        lista.wyswietl();
        System.out.print("Wyswietl liste po usunieciu elementu ");
        lista.usun(liczby);
        lista.wyswietl();
        lista.wyswetlWodwrotnejKolejnosci();
        lista.pisz();
        System.out.println(lista.znajdz(liczby2));
        lista.zapiszDoPliku();
        lista.usunWszystkiePowtorzenia();
    }

}
