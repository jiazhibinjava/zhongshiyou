package org.orks.zhongshiyou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class CommodityController {

    /**
     * 返回主商品池页面
     * @return
     */
    @RequestMapping("/mainCommodityPool")
    public String mainCommodityPool(){
        return "commodity/mainCommodityPool";
    }

    /**
     * 返回预商品池页面
     * @return
     */
    @RequestMapping("/preCommodityPool")
    public String preCommodityPool(){

        return "commodity/preCommodityPool";
    }

    /**
     * 返回回收池页面
     * @return
     */
    @RequestMapping("/recycleBin")
    public String recycleBin(){
        return "commodity/recycleBin";
    }
}
