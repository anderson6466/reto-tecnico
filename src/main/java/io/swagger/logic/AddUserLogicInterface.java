package io.swagger.logic;

import org.springframework.http.ResponseEntity;

import io.swagger.model.RequestUser;
import io.swagger.model.ResponseUser;

public interface AddUserLogicInterface {
	
	
public ResponseEntity<ResponseUser>	addUser  (RequestUser user);

}
