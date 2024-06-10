package com.modakdev.lib;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.simple.JSONObject;

import java.lang.reflect.Type;
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
        List<String> columnList = gson.fromJson(jsonObject.get("encodedColumns").toString(), listType);
        jsonObject.remove("encodedColumns");
        jsonObject.put("encodedColumns", columnList);
    }
}
