package org.orks.zhongshiyou.controller;

import org.orks.zhongshiyou.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@Controller
public class LoginController  {



    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Map<String ,Object> login(HttpServletRequest request, WebRequest webRequest){
        Map<String,Object> map = new HashMap<>();
        String userName=request.getParameter("userName");
        String password = request.getParameter("password");
        if(userName.equals("dianshang") && password.equals("1")){
            User user = new User();
            user.setUserName(userName);
            user.setPassword(password);
            user.setGroup(3);
            request.getSession().setAttribute("user", user);
            webRequest.setAttribute("userGroup", 3, RequestAttributes.SCOPE_REQUEST);
            map.put("result", 1);
        } else if(userName.equals("shiyou") && password.equals("1")){
            User user = new User();
            user.setUserName(userName);
            user.setPassword(password);
            user.setGroup(4);
            request.getSession().setAttribute("user", user);
//            request.getSession().setAttribute("userGroup");
            webRequest.setAttribute("userGroup", 4, RequestAttributes.SCOPE_REQUEST);
            map.put("result", 1);
        } else if(userName.equals("group") && password.equals("1")){
            User user = new User();
            user.setUserName(userName);
            user.setPassword(password);
            user.setGroup(2);
            request.getSession().setAttribute("user", user);
            webRequest.setAttribute("userGroup", 2, RequestAttributes.SCOPE_REQUEST);
            map.put("result", 1);

        } else if(userName.equals("admin") && password.equals("1")){
            User user = new User();
            user.setUserName(userName);
            user.setPassword(password);
            user.setGroup(1);
            request.getSession().setAttribute("user", user);
            map.put("result", 1);
            webRequest.setAttribute("userGroup", 1, RequestAttributes.SCOPE_REQUEST);
        }else {
            map.put("result", 0);
        }
        return map;
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest httpServletRequest){
        httpServletRequest.getSession().invalidate();
        return "login";
    }
}
