package vcode.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vcode.service.IndexService;
import vcode.service.UserService;

@Controller("/")
public class IndexController {

    @Autowired
    private UserService userService;
    @RequestMapping("index.do")
    public @ResponseBody String init(){
        JSONObject jsonObject = new JSONObject();
        return jsonObject.toJSONString(userService.getUserList(5));
    }

}
