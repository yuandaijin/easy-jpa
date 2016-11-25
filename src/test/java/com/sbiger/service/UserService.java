package com.sbiger.service;

import com.sbiger.entity.User;
import com.sbiger.reponsitory.UserReponsitory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sbiger on 2016-11-25.
 */
@Service
public class UserService {
    @Resource
    UserReponsitory userReponsitory;

    public List<User> findAll(){
        return userReponsitory.findAll();
    }
}