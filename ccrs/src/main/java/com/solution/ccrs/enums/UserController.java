package com.solution.ccrs.enums;

import com.solution.ccrs.dto.LoginRequest;
import com.solution.ccrs.dto.RegisterRequest;
import com.solution.ccrs.entity.User;

public interface UserController {

    User register(RegisterRequest request);

    User login(LoginRequest request);

    User getProfile(Integer userId);

    User updateProfile(Integer userId, String email, String phone, String pan);

    void deactivate(Integer userId);
}
