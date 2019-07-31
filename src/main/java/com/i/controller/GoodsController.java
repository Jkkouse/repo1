package com.i.controller;

import com.i.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    @RequestMapping("/selAllGoods")
    @ResponseBody
    public List<Map> selAllGoods(){
        return goodsService.selAllGoods();
    }
}
