package org.orks.zhongshiyou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

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

    /**
     * 用户信息修改页面
     * @return
     */
    @RequestMapping(value = "/user-edit",method= RequestMethod.GET)
    public String useredit() {
        return "user/user-edit";
    }

    /**
     * 组信息修改页面
     * @return
     */
    @RequestMapping(value = "/group-edit",method= RequestMethod.GET)
    public String groupedit() {
        return "user/group-edit";
    }
}
