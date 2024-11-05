package cn.jinhua.bootstarterdemo.autoconfigure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jinhua-Lee
 */
@Slf4j
@Configuration
@EnableFeignClients(basePackages = "cn.jinhua.bootstarterdemo.api")
public class BootStarterDemoAutoconfigure {

    public BootStarterDemoAutoconfigure() {
        log.info("BootStarterDemoAutoconfigure init");
    }
}
