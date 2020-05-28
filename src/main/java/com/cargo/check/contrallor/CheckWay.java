package com.cargo.check.contrallor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author DYB
 * @date 2020年05月09日 15:26
 */
@Controller("/CheckWay")
public class CheckWay {
    @RequestMapping("/start")
    public String start(){

        return "start" ;
    }
}
