package ind.ck.config.net;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author BJQXDN0626
 * @create 2018/1/26
 */
@FeignClient("DREKA-CLI")
public interface StoreClient {
    @RequestMapping(method = RequestMethod.GET, value = "/stores")
    String getStores();

//    @RequestMapping(method = RequestMethod.POST, value = "/stores/{storeId}", consumes = "application/json")
//    Store update(@PathVariable("storeId") Long storeId, Store store);
}
