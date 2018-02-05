package ind.ck.sbclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * eureka client
 * @author BJQXDN0626
 * @create 2018/1/29
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/stores", method = RequestMethod.GET)
    public String home() {
        return "d:" + port;
    }

}
