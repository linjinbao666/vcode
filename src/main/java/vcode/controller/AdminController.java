package vcode.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vcode.service.UserService;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;

    /**
     * 获取所有用户列表
     * @return
     */
    @RequestMapping("/users.do")
    @ResponseBody
    public String getUserList(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",0);
        jsonObject.put("msg","获取成功！");
        jsonObject.put("count", 10);
        jsonObject.put("data",userService.getUserList(10));
        return jsonObject.toJSONString();
    }

    /**
     * 获取所有管理员
     * @return
     */
    @RequestMapping("/adminUser.do")
    public @ResponseBody String getAdminList(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",0);
        jsonObject.put("msg","获取管理员列表成功！");
        jsonObject.put("count",10);
        jsonObject.put("data",userService.getUserListByRole("2",10));
        return jsonObject.toJSONString();
    }
}
