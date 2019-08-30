package com.tonmx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author elln
 * @date 2019/8/29
 */
@RestController
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class ConfigController {

    @Value("${bxz.name}")
    private String username;

    @RequestMapping("/hello")
    public String from() {
        return this.username;
    }
}
