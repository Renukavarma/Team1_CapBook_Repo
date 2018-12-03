package com.cg.capbook.services;

import com.cg.capbook.beans.Person;
import com.cg.capbook.exceptions.UserNotFoundException;


public interface UserServices {
	Person createUserAccount(Person user);
	Person getUserAccount(Person user) throws UserNotFoundException;

}