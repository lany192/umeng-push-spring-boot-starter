package com.github.lany192.push.config;

import com.github.lany192.push.PushClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Configuration
@EnableConfigurationProperties(UmengPushProperties.class)
public class UmengPushAutoConfig {

    @Bean
    @ConditionalOnMissingBean
    public PushClient pushClient(UmengPushProperties properties) {
        if (ObjectUtils.isEmpty(properties.getAppKey()) || ObjectUtils.isEmpty(properties.getAppSecret())) {
            throw new RuntimeException("请先配置友盟推送的appkey和appSecret");
        }
        return new PushClient(properties.getAppKey(), properties.getAppSecret());
    }
}
