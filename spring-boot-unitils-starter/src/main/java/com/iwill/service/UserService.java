package com.iwill.service;

import com.iwill.mapper.UserMapper;
import com.iwill.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public String getUsername(Long userId) {
        UserDTO userDTO = userMapper.selectById(userId);
        return userDTO.getName();
    }
}
