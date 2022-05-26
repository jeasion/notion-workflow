package com.jeasion.notion.util;

import com.jeasion.notion.config.PropertyConfigs;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import tw.yukina.notion.sdk.client.api.ApiClient;
import tw.yukina.notion.sdk.client.api.ApiClientFactory;

import javax.annotation.Resource;

/**
 * @author liushanping
 */
@Component
public class NotionUtil {
    @Resource
    private PropertyConfigs propertyConfigs;

//    @Bean
//    public NotionClient getNotionClient() {
//        return new NotionClientImpl(propertyConfigs.getNotionToken());
//    }

    @Bean
    public ApiClient getApiClient() {
        ApiClientFactory apiClientFactory = new ApiClientFactory();
        apiClientFactory.setToken(propertyConfigs.getNotionToken());
        apiClientFactory.applyDefaultSetting();
        return apiClientFactory.build();
    }
}
