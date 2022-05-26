package com.jeasion.notion.config;

import cn.hutool.core.util.StrUtil;
import com.jeasion.notion.common.StringPool;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author liushanping
 */
@Configuration
@Data
public class PropertyConfigs {

    @Value("notion.token")
    private String notionToken;

    @Value("notion.task.uuids")
    private String taskIdStr;

    @Value("notion.job.uuids")
    private String jobIdStr;


    public Set<UUID> getTaskIds() {
        return StrUtil.split(taskIdStr, StringPool.COMMA).stream().map(UUID::fromString).collect(Collectors.toSet());
    }

    public Set<UUID> getJobIds(){
        return StrUtil.split(jobIdStr, StringPool.COMMA).stream().map(UUID::fromString).collect(Collectors.toSet());
    }

}
