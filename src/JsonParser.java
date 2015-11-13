import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

/**
 * A sample to see how parsing json files from Bing API works.
 *
 * Used Tutrioals:
 * <ul>
 *     <li>http://wiki.fasterxml.com/JacksonInFiveMinutes#A.22Raw.22_Data_Binding_Example</li>
 * </ul>
 */
public class JsonParser {
    private ObjectMapper mapper;
    private final String jsonUrl;

    public JsonParser(final String jsonUrl){
        this.jsonUrl = jsonUrl;
        mapper = new ObjectMapper();
    }

    public BingTraffic parse() throws IOException {
        return mapper.readValue(new File(jsonUrl), BingTraffic.class);
    }

    public static void main(String[] args) {
//        JsonParser jp = new JsonParser("sample.json");

        JsonParser jp = new JsonParser("test.json");
        try {
            BingTraffic bingTraffic = jp.parse();
            System.out.println(bingTraffic.getDescription());
            System.out.println(bingTraffic.getCongestion());
            System.out.println(bingTraffic.getPoint().getType());
            System.out.println(bingTraffic.getPoint().getCoordinates());
            System.out.println(bingTraffic.getPoint().getLatitude());
            System.out.println(bingTraffic.getPoint().getLongitude());
            System.out.println(bingTraffic.getDetour());

            // ToDo
            System.out.println(bingTraffic.getEnd());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
