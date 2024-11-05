package cn.jinhua.bootstarterdemo.restapi;

import cn.jinhua.bootstarterdemo.api.DemoApi;
import cn.jinhua.bootstarterdemo.common.req.DemoReq;
import cn.jinhua.bootstarterdemo.common.resp.DemoResp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jinhua-Lee
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController implements DemoApi {
    @Override
    @PostMapping(value = "/func")
    public DemoResp func(@RequestBody DemoReq req) {
        return DemoResp.builder()
                .name(req.getName())
                .build();
    }
}
