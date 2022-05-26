package com.jeasion.notion.api;

import com.jeasion.notion.common.Config;
import com.jeasion.notion.util.NotionApiUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author liushanping
 */
@RestController
@RequestMapping("/notion/api/")
public class NationApiController {


    @Resource
    private NotionApiUtils notionApiUtils;

    @Resource
    private Config config;

    @GetMapping("/query/databases/database_id/query")
    public String getDatabases(){
        String result = notionApiUtils.getDataBases();
        System.out.println(result);
        return result;
    }

}
