import java.io.IOException;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void HUD() throws IOException, ParseException, org.json.simple.parser.ParseException {
        System.out.println("API czasem lubi pobierać dane przez dość długi czas, więc proszę o bycie cierpliwym :) \n");
        System.out.println("Jak wiele krajów chcesz zapisać? (Więcej niż 0): ");
        Scanner input = new Scanner(System.in);
        double countries = input.nextDouble();
        List<String> countriesList = new ArrayList<String>();

        for(int i = 0; i < countries; i++){
            Scanner input1 = new Scanner(System.in);
            System.out.println("\nWpisz nazwę kraju numer " + (i+1) + ". (Nazwę kraju wpisz po angielsku z małych, lub dużych liter, lub nazwę skrótową np. USA");
            String countryName = input1.nextLine();
            String restURL = "https://restcountries.eu/rest/v2/name/" + countryName.toString();

            List<CountryData> kraj = DataPuller.createJsonList(restURL);
            /*System.out.println(kraj);*/
            countriesList.add(kraj.toString());
           /* System.out.println(countriesList);*/


        }

        Scanner input2 = new Scanner(System.in);
        System.out.println("\nWpisz jak chcesz nazwać swój plik: (Bez .json) ");
        String file = input2.nextLine();
        JSONFileMaker.saveJsonFile(countriesList, file);
    }
}
