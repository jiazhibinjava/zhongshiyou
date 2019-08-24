package org.orks.zhongshiyou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    /**
     * 返回用户组管理页面
     * @return
     */
    @RequestMapping("/userGroupManagement")
    public String userGroupManagement(){
        return "user/userGroupManagement";
    }

    /**
     * 返回用户信息页面
     * @return
     */
    @RequestMapping("/userManagement")
    public String userManagement(){
        return "user/userManagement";
    }
}
