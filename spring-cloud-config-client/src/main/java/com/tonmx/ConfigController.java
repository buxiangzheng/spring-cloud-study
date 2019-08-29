package com.tonmx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author elln
 * @date 2019/8/29
 */
@RestController
public class ConfigController {

    @Value("${bxz.name}")
    private String username;

    @RequestMapping("/hello")
    public String from() {
        return this.username;
    }
}
