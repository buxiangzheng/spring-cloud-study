package com.tonmx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author elln
 * @date 2019/8/28
 */
@RestController
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(getClass());


    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        logger.info("request two name is " + name);
        try {
            Thread.sleep(1000000);
        } catch (Exception e) {
            logger.error(" hello two error", e);
        }
        return "hello " + name + "，this is two messge";
    }
}
