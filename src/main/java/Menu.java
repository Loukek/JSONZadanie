import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void HUD() throws IOException, ParseException, org.json.simple.parser.ParseException {
        System.out.println("Jak wiele krajów chcesz zapisać? (Więcej niż 0): ");
        Scanner input = new Scanner(System.in);
        double countries = input.nextDouble();


        Scanner input1 = new Scanner(System.in);
        String countryName = input1.nextLine();
        String restURL = "https://restcountries.eu/rest/v2/name/" + countryName.toString();

        List<CountryData> list = DataPuller.createJsonList(restURL);

        System.out.println(list);


    }
}
