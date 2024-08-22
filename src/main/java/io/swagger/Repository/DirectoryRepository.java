package io.swagger.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.dto.Directory;
import io.swagger.dto.User;

public interface DirectoryRepository  extends  JpaRepository<Directory, Long>{

}
