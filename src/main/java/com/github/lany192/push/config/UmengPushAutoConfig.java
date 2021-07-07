package com.github.lany192.push.config;

import com.github.lany192.push.PushClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UmengPushProperties.class)
public class UmengPushAutoConfig {

    @Bean
    @ConditionalOnMissingBean
    public PushClient pushClient(UmengPushProperties properties) {
        return new PushClient(properties.getAppKey(), properties.getAppSecret());
    }
}
