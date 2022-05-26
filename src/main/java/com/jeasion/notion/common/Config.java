package com.jeasion.notion.common;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author liushanping
 */
@Configuration
@Data
public class Config {

    @Value("${notion.token}")
    private String token;

    @Value("${notion.version}")
    private String notionVersion;

    @Value("${notion.url.query.databases}")
    private String databasesUrl;

}
