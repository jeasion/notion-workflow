package com.jeasion.notion.job;

import com.jeasion.notion.config.PropertyConfigs;
import org.springframework.stereotype.Component;
import tw.yukina.notion.sdk.client.api.ApiClient;

import javax.annotation.Resource;

/**
 * @author liushanping
 */
@Component
public class NotionJob {

    @Resource
    private PropertyConfigs propertyConfigs;

    @Resource
    private ApiClient apiClient;



}
