package org.kraken.DBDRandomAndData.models;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Fetcher {
    public static HashMap<String, String> fetchPerks () throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        LinkedHashMap<String, String> fetchedPerks = mapper.readValue(new URL("file:src/main/resources/static/perks/perks.json"), LinkedHashMap.class);
        return fetchedPerks;
    }

    public static HashMap<String, String> fetchOfferings () throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        LinkedHashMap<String, String> fetchedOfferings = mapper.readValue(new URL("file:src/main/resources/static/offerings/offerings.json"), LinkedHashMap.class);
        return fetchedOfferings;
    }

    public static HashMap<String, String> fetchKillers () throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        LinkedHashMap<String, String> fetchedKillers = mapper.readValue(new URL("file:src/main/resources/static/killers/killers.json"), LinkedHashMap.class);
        return fetchedKillers;
    }

    public static HashMap<String, String> fetchKillerPictures () throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        LinkedHashMap<String, String> fetchedKillerPictures = mapper.readValue(new URL("file:src/main/resources/static/killers/killerPictures.json"), LinkedHashMap.class);
        return fetchedKillerPictures;
    }

    public static HashMap<String, String> fetchKillerAddons (String killerName) throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        HashMap<String, String> output = new HashMap<>();
        ArrayList<HashMap<String, String>> allKillersAndAddons = mapper.readValue(new URL("file:src/main/resources/static/killers/killerAddons.json"), ArrayList.class);
        for (HashMap<String, String> item : allKillersAndAddons) {
            if (item.containsValue(killerName)) {
                output = item;
            }
        }
        return output;
    }
}
