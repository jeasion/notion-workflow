package com.jeasion.notion.common;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author liushanping
 */
@Component
public class HeaderRequestInterceptor implements ClientHttpRequestInterceptor {

    @Resource
    private Config config;

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {

        HttpHeaders headers = request.getHeaders();
        headers.setAll(
                new HashMap<String, String>(3) {
                    {
                        put(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
                        put(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
                        put(StringPool.NOTION_VERSION, config.getNotionVersion());
                    }
                }
        );

        headers.setBearerAuth(config.getToken());

        return execution.execute(request, body);
    }
}