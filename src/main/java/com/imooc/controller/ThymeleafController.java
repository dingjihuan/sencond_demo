package com.imooc.controller;import com.imooc.pojo.Resource;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Controller;import org.springframework.ui.Model;import org.springframework.web.bind.annotation.RequestMapping;@Controller@RequestMapping("th")public class ThymeleafController {    @RequestMapping("/index")    public String index(Model model){        model.addAttribute("name","张三");        return "thymeleaf/index";    }}