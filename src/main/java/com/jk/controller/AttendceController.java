/**
 * Copyright (C), 2015-2019,
 * FileName: AttendceController
 * Author:   王肖波
 * Date:     2019/2/27 21:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


package com.jk.controller;

import com.jk.entity.Attends;
import com.jk.service.AttendceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 王肖波
 * @create 2019/2/27
 * @since 1.0.0
 */
@Controller
@RequestMapping
public class AttendceController {
    @Autowired
    private AttendceService attendceService;

    @RequestMapping("/")
    public String  index(){
        return  "attendce/index";
    }
    @RequestMapping("/test")
    public  String  test(){
        return  "attendce/test";
    }
    @RequestMapping("/attendsList")
    public  String  attendsList(Attends attends, Model model){
        List<Attends> attendslist = attendceService.attendsList(attends);
        model.addAttribute("attendceList",attendslist);
        return   "attendce/attendcelist";

    }
}
