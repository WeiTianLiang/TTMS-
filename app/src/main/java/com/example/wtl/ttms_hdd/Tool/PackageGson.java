package com.example.wtl.ttms_hdd.Tool;

import com.google.gson.Gson;

import java.util.Map;

/**
 * 封装数据为json
 * Created by WTL on 2018/6/7.
 */

public class PackageGson {

    public static String PacketGson(Map<String,Object> map) {
        Gson gson = new Gson();
        String jsonData = gson.toJson(map);
        return jsonData;
    }

}
