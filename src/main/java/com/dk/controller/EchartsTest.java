package com.dk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class EchartsTest {

    @RequestMapping("test")
    public String test(){
        return "echarts";
    }

    @RequestMapping("getData")
    @ResponseBody
    public Map<String,Object> getData(){
        Map<String,Object> map = new HashMap<>();
        String[] type = {"衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"};
        int[] data = {5,7,45,36,26,18};
        map.put("type",type);
        map.put("data",data);
        return map;
    }

    @RequestMapping("test2")
    public String test2(){
        return "echarts-2";
    }
}
