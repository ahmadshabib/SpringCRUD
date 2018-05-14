package com.universalyazilim.universalodev.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Ahmad
 */
@Controller

public class PageController {

    @RequestMapping("/login")
    public String getLoginPage() {
        return "login";
    }
    @RequestMapping("/")
    public String getIndexPage() {
        return "/contactBook";
    }

    @RequestMapping("/contactBook")
    public String getMainPage() {
        return "/contactBook";
    }
}
