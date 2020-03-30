package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.entity.Users;
import com.hidialect.hidialect_ws.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UsersController {
    @Autowired
    private IUsersService iUsersService;
    /* 日期：20200314
     * 创建人：陈雨豪 */
    @RequestMapping(value = "/loginUsers",method = RequestMethod.POST)
    private Users pwdLogin(@RequestParam String userNo, @RequestParam String password){
        return iUsersService.pwdLogin(userNo,password);
    }
    @RequestMapping(value = "/signinStatus",method = RequestMethod.POST)
    private Users signinStatus(@RequestParam String phone){
        return iUsersService.signinStatus(phone);
    }
    @RequestMapping(value = "/changePwd",method = RequestMethod.POST)
    private void changePwd(@RequestParam String userNo, @RequestParam String password){
        iUsersService.changePwd(userNo,password);
    }
    @RequestMapping(value = "/signin",method = RequestMethod.POST)
    private void signin(@RequestParam String userNa,
                        @RequestParam String password,
                        @RequestParam String phone,
                        @RequestParam String QQNum,
                        @RequestParam String WeChatNum,
                        @RequestParam byte sex){
        Users user=new Users();
        user.setUserNa(userNa);
        user.setPassword(password);
        user.setPhone(phone);
        //存储图片位置暂未设置
        user.setQQNum(QQNum);
        user.setWeChatNum(WeChatNum);
        user.setSex(sex);
        user.setAttentionNum(0);
        user.setFansNum(0);
        user.setMoney(0);
        iUsersService.signin(user);
    }
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    private void edit(@RequestParam Integer userNo,
                      @RequestParam String userNa,
                      @RequestParam String phone,
                      @RequestParam String QQNum,
                      @RequestParam String WeChatNum,
                      @RequestParam byte sex){
        Users user=iUsersService.getByuserNo(userNo);
        user.setUserNa(userNa);
        user.setPhone(phone);
        user.setQQNum(QQNum);
        //存储图片位置暂未设置
        user.setWeChatNum(WeChatNum);
        user.setSex(sex);
        iUsersService.edit(user);
    }
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.POST)
    private Users getUserInfo(@RequestParam Integer userNo){
        return iUsersService.getByuserNo(userNo);
    }
    //缺少退出登录
}