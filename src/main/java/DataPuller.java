import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataPuller {
    public static List<CountryData> createJsonList(String urlString) throws IOException, ParseException {
        List<CountryData> data = new ArrayList<>();
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        int responsecode = conn.getResponseCode();
        if (responsecode != 200) {
            throw new RuntimeException("HttpResponseCode: " + responsecode);
        } else {

            String inline = "";
            Scanner scanner = new Scanner(url.openStream());

            while (scanner.hasNext()) {
                inline += scanner.nextLine();
            }

            scanner.close();
            JsonArray cos = new JsonParser().parse(String.valueOf(inline)).getAsJsonArray();
            String name = cos.get(0).getAsJsonObject().get("name").getAsString();
            String currency = cos.get(0).getAsJsonObject().get("currencies").getAsJsonArray().get(0).getAsJsonObject().get("symbol").getAsString();
            String code3 = cos.get(0).getAsJsonObject().get("numericCode").getAsString();
            String capital = cos.get(0).getAsJsonObject().get("capital").getAsString();
            String language = cos.get(0).getAsJsonObject().get("languages").getAsJsonArray().get(0).getAsJsonObject().get("name").getAsString();
            String region = cos.get(0).getAsJsonObject().get("region").getAsString();

            CountryData countryObj = new CountryData(name, code3, capital, language, currency, region);
            data.add(countryObj);


        }
        return data;
    }

}
