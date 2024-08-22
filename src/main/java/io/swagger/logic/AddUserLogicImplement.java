package io.swagger.logic;

import java.time.LocalDate;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.status.Status;
import io.swagger.Repository.DirectoryRepository;
import io.swagger.Repository.UserRepository;
import io.swagger.api.CreateUserApiController;
import io.swagger.dto.Directory;
import io.swagger.dto.User;
import io.swagger.model.RequestUser;
import io.swagger.model.ResponseUser;
import io.swagger.security.UtilEncodeJWT;

@Service
public class AddUserLogicImplement implements AddUserLogicInterface {
    private static final Logger log = LoggerFactory.getLogger(CreateUserApiController.class);
    @Autowired
    public UserRepository userRepository;
    @Autowired
    public DirectoryRepository directoryRepository;
    private LocalDate fechaD = LocalDate.now();

    @Override
    public ResponseEntity < ResponseUser > addUser(RequestUser user) {


        ResponseUser rsp = new ResponseUser();

        try {

            if ((userRepository.getCountEmail(user.getEmail()) >= 1)) {
                rsp.setMensaje("Correo ya esta registrado");
                return ResponseEntity.ok(rsp);


            }

            User userDto = new User();
            userDto.setEmail(user.getEmail());
            userDto.setName(user.getName());
            userDto.setPassword(user.getPassword());
            userDto.setIsactive(true);
            userDto.setModified(fechaD);
            userDto.setLast_login(fechaD);
            userDto.setCreated(fechaD);

            userDto.setLlaveToken(UtilEncodeJWT.getJWTToken(user.getName()));
            Directory directory = new Directory();



            userDto = userRepository.save(userDto);
            final UUID id = userDto.getId();

            if (!(id.equals(null))) {
                user.getPhones().forEach((x -> {

                    directory.setCitycode(x.getCitycode());
                    directory.setContrycode(x.getContrycode());
                    directory.setIdUser(id);
                    directory.setNumber(x.getNumber());
                    directory.setModified(fechaD);
                    directory.setCreated(fechaD);
                    directoryRepository.save(directory);
                }));

                rsp.setIsactive(userDto.isIsactive());
                rsp.setId(userDto.getId());
                rsp.setLastLogin(userDto.getLast_login());
                rsp.setCreated(userDto.getCreated());
                rsp.setModified(userDto.getModified());
                rsp.setToken(userDto.getLlaveToken());
            };


            return ResponseEntity.ok(rsp);

        } catch (Exception ex) {
            log.error("descripcion del error", ex);
            return new ResponseEntity < ResponseUser > (HttpStatus.INTERNAL_SERVER_ERROR);

        }


    }


}