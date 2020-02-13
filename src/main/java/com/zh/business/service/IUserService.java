package com.zh.business.service;

import com.zh.business.pojo.User;
import com.zh.business.utils.ServerResponse;




public interface IUserService {

    /*
    登录
     */
    public ServerResponse loginLogic(String username,String password);

    public  ServerResponse registerLogic(User user);
}
