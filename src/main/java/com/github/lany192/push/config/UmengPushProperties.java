package com.github.lany192.push.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置属性
 */
@Data
@ConfigurationProperties(prefix = "umeng.push")
public class UmengPushProperties {

    private String appKey;

    private String appMasterSecret;
}
