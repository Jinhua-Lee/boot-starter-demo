package cn.jinhua.bootstarterdemo.api;

import cn.jinhua.bootstarterdemo.common.req.DemoReq;
import cn.jinhua.bootstarterdemo.common.resp.DemoResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Jinhua-Lee
 */
@FeignClient(
        value = "boot-starter-demo",
        contextId = "demoApi",
        path = "/demo"
)
public interface DemoApi {

    /**
     * 某个功能
     *
     * @param req 请求参数
     * @return 响应参数
     */
    @PostMapping(value = "/func")
    DemoResp func(@RequestBody DemoReq req);
}
