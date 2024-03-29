package org.orks.zhongshiyou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    /**
     * 返回主页面
     * @return
     */
    @RequestMapping("/index")
    public String index()
    {
        return "index";
    }

    @RequestMapping("/welcome")
    public String welcome()
    {
        return "welcome";
    }
}
