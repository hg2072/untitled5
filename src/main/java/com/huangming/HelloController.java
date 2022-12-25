package com.huangming;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping(path = "/hello.do")
    public String sayHello(Model model){
        System.out.println("稽核厅数据一致性维护");
        model.addAllAttributes("msg","hello,Springmvc");
        return "suc";
    }
}
