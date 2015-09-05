package io.github.movax10.sublator.service;

import org.springframework.stereotype.Service;

import io.github.movax10.sublator.persist.entity.User;
import io.github.movax10.sublator.service.dto.UserDto;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, UserDto, Long> implements UserService {


}
