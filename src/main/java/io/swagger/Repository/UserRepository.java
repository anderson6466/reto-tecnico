package io.swagger.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.swagger.dto.User;
@Repository
public interface UserRepository   extends  JpaRepository<User, Integer> {
	
	@Query(value="select count(*) from user  where email= :e_mail", nativeQuery=true)
    public  int getCountEmail(String e_mail);

}
