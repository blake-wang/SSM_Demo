package com.wanglei.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: WangL
 * @Date: 2019/5/26 23:02
 */
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("list")
    public String list() {
        return "user/list";
    }
}
