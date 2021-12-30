package com.tzf.dashboard.config;

import com.tzf.dashboard.common.config.BaseRedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * Redis配置类
 * Created by macro on 2020/3/2.
 */
@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig {

}