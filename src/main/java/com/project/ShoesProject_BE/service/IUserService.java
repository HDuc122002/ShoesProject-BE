package com.project.ShoesProject_BE.service;

import com.project.ShoesProject_BE.model.dto.UserDTO;
import com.project.ShoesProject_BE.exception.DataNotFoundException;
import com.project.ShoesProject_BE.model.User;

public interface IUserService {
    User createUser(UserDTO userDTO) throws DataNotFoundException;
    String login(String phoneNumber, String password);
}
