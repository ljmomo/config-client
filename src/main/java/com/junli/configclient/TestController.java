package com.junli.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijun
 * @time 2018-01-18 10:48
 */
@RestController
@RefreshScope
public class TestController {
    @Value("${from}")
    private  String from;

    @RequestMapping("from")
    public String from() {
        return this.from;
    }
}
