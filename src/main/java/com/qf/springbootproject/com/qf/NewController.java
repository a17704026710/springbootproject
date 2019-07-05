package com.qf.springbootproject.com.qf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2019/7/5
 */

@RestController
public class NewController {
    @RequestMapping("/hello")
    public String controller(){
        return "!!!!!!";

    }
    public String controller1(){
        return "!!!!!!";

    }

     public String aqwige(){
        return "!!!!!!";

    }
     public String aqwige22(){
            return "!!!!!!";

        }
}
