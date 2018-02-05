package ind.ck.config.controller;

import ind.ck.config.net.StoreClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BJQXDN0626
 * @create 2018/1/29
 */
@RestController
@RequestMapping("")
public class TestController {

//    @Value("${ck}")
    String name = "World";

    @Autowired
    private StoreClient storeClient;

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String test(){
        return storeClient.getStores().toString();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test2(){
        return "okde2";
    }

}
