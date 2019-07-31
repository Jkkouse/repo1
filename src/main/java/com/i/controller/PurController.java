package com.i.controller;

import com.i.service.PurService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/pur")
public class PurController {

    @Resource
    private PurService purService;

    @RequestMapping("/getPurCount")
    @ResponseBody
    public String getPurCount(){
        int count = purService.getPurCount() + 1;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String purno = null;
        if(count < 10){
            purno = "NO" + sdf.format(new Date()) + "000" + count;
        }else if(count < 100){
            purno = "NO" + sdf.format(new Date()) + "00" + count;
        }else if(count < 1000){
            purno = "NO" + sdf.format(new Date()) + "0" + count;
        }else{
            purno = "NO" + sdf.format(new Date()) + count;
        }
        return purno;
    }

    @RequestMapping("/submitForm")
    @ResponseBody
    public String submitForm(@RequestBody Map map){
        System.out.println(map);
        boolean flag = purService.addPur(map);
        System.out.println(flag);
        if(flag) {
            return "true";
        }else{
            return "false";
        }
    }

    @RequestMapping("/selAllPurOrder")
    @ResponseBody
    public List<Map> selAllPurOrder(){
        return purService.selAllPurOrder();
    }
}
