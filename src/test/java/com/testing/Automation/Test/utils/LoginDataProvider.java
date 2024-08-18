package com.testing.Automation.Test.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class LoginDataProvider {


    static Map<String, Object> testData;

    static {
        ObjectMapper mapper = new ObjectMapper();
        try (var reader = new FileReader("src/main/resources/logincredentials.json")) {
            testData = mapper.readValue(reader, Map.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUsername() throws JSONException {
        return (String) testData.get("username");
    }

    public static String getPassword() throws JSONException {
        return (String) testData.get("password");
    }

}


