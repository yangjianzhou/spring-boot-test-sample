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
        UserDTO userDTO = new UserDTO();
        userDTO.setName("wangwu");
        userMapper.insert(userDTO);
        userDTO.setName("houloiu");
        userMapper.insert(userDTO);
        userDTO = userMapper.selectById(userId);
        return userDTO.getName();
    }

    public Long insertUser(UserDTO userDTO){
        return userMapper.insert(userDTO);
    }
}
