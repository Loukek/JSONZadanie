import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class JSONFileMaker {
    public static void saveJsonFile(List<String> data, String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        try{
            mapper.writeValue(new File("json/" + fileName + ".json"), data);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
