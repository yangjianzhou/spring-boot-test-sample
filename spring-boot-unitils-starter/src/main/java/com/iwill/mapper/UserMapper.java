package com.iwill.mapper;

import com.iwill.model.UserDTO;

public interface UserMapper {

    UserDTO selectById(long id);
}
