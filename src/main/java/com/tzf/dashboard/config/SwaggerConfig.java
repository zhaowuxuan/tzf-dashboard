package com.tzf.dashboard.config;

import com.tzf.dashboard.common.config.BaseSwaggerConfig;
import com.tzf.dashboard.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by macro on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.tzf.dashboard.modules")
                .title("dashboard项目骨架")
                .description("dashboard项目骨架相关接口文档")
                .contactName("tzf")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
