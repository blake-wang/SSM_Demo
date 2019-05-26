package com.wanglei.web.controller;

import com.wanglei.model.Items;
import com.wanglei.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: WangL
 * @Date: 2019/5/27 00:01
 */
@Controller
@RequestMapping("items")
public class ItemController {
    @Autowired
    private IItemsService itemsService;

    @RequestMapping("list")
    public String list() {
        System.out.println("接收到请求了");
        List<Items> allItems = itemsService.findAllItems();
        for (Items allItem : allItems) {
            System.out.println(allItem);
        }
        return "items/list";
    }
}
