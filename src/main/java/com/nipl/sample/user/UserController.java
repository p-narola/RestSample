package com.nipl.sample.user;

import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@EnableAutoConfiguration
public class UserController {

	@RequestMapping(value="/users", method = RequestMethod.GET)
    @ResponseBody
	public ArrayList<User> getUsers() {

        ArrayList<InternalUser> users = new ArrayList<InternalUser>();
        users.add(new InternalUser("John"));
		return UserMapper.INSTANCE.internalUsersToUsers(users);

	}


}