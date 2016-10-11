package com.nipl.sample.user;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source="userName", target = "name")
    User internalUserToUser(InternalUser internalUser);

    ArrayList<User> internalUsersToUsers(ArrayList<InternalUser> internalUser);
}
