package com.modakdev.lib;

import org.json.simple.JSONObject;

import java.util.LinkedHashMap;
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
}
