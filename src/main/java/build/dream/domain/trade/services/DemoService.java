package build.dream.domain.trade.services;

import build.dream.domain.trade.api.DemoApi;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoService implements DemoApi {
    @Override
    public String test() {
        return null;
    }
}
