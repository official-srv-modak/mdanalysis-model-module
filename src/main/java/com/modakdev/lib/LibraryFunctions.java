package com.modakdev.lib;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class LibraryFunctions {

    public static JSONObject convertToJSONObject(LinkedHashMap<String, Object> map) {
        JSONObject jsonObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            jsonObject.put(entry.getKey(), entry.getValue());
        }
        return jsonObject;
    }

    public static String buildDescription(String name) {
        String output = "";
        StringBuilder sb = new StringBuilder(output);

        for (int i = 0; i < name.toCharArray().length; i++) {
            char ch = name.charAt(i);
            if (ch == '_')
                ch = ' ';
            if(i==0)
                ch = Character.toUpperCase(ch);
            sb.append(ch);
        }
        output = sb.toString();
        return output;
    }

    public static void fixLists(JSONObject jsonObject) {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<String>>() {}.getType();

        try {
            // Extract encodedColumns as JSON array, convert to List<String> using Gson
            List<String> columnList = gson.fromJson(jsonObject.getJSONArray("encodedColumns").toString(), listType);

            // Remove the original encodedColumns key
            jsonObject.remove("encodedColumns");

            // Add the new encodedColumns key with the List<String> value
            jsonObject.put("encodedColumns", columnList);

        } catch (JsonParseException e) {
            // Handle Gson parsing errors
            e.printStackTrace();
        } catch (Exception e) {
            // Handle other exceptions
            e.printStackTrace();
        }
    }

    public static Double getAccuracyPercentage(Double accuracy){
        Double output;
        DecimalFormat df = new DecimalFormat("##.##");
        accuracy *= 100;
        // Format the number using the DecimalFormat object
        String formattedNumber = df.format(accuracy);
        output = Double.parseDouble(formattedNumber);
        return output;
    }
}
