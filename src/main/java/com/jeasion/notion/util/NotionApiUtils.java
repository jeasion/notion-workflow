package com.jeasion.notion.util;

import cn.hutool.json.JSONObject;
import com.jeasion.notion.common.Config;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author liushanping
 */
@Component
public class NotionApiUtils {
    @Resource
    private RestTemplate restTemplate;

    @Resource
    private Config config;


    public <T> T getData(String url, Map<String, ?> params, Class<T> clazz) {
        return restTemplate.getForObject(url, clazz, params);
    }

    public String getDataBases() {
        String paramter = "{\"page_size\":100}";

        JSONObject json = restTemplate.postForObject(config.getDatabasesUrl(), paramter, JSONObject.class);
        return json.toString();
    }


//    OkHttpClient client = new OkHttpClient();
//
//    MediaType mediaType = MediaType.parse("application/json");
//    RequestBody body = RequestBody.create(mediaType, "{\"page_size\":100}");
//    Request request = new Request.Builder()
//            .url("")
//            .post(body)
//            .addHeader("Accept", "application/json")
//            .addHeader("Notion-Version", "2022-02-22")
//            .addHeader("Content-Type", "application/json")
//            .build();
//
//    Response response = client.newCall(request).execute();
//

}
