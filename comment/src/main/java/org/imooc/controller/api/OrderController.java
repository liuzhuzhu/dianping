package org.imooc.controller.api;

import org.springframework.stereotype.Controller;

@Controller
public class OrderController {
    public void addOrder(){
        System.out.println("team2 开发订单  第一天");
    }
    public void delOrder(){
        System.out.println("team2 开发订单  第一天   夜晚 ");
    }
    public void updateOrder(){
        System.out.println("team2 开发订单  第二天");
    }
}
