package io.swagger.dto;

import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonProperty;
@Entity

@Table

public class User {
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Id
    @GeneratedValue
    @Column
    @JsonProperty("id")
    private UUID id;
    @Column
    @JsonProperty("name")
    private String name;
    @Column
    @JsonProperty("llaveToken")
    private String llaveToken;
    public String getLlaveToken() {
        return llaveToken;
    }
    public void setLlaveToken(String llaveToken) {
        this.llaveToken = llaveToken;
    }
    @Column
    @JsonProperty("isactive")
    private boolean isactive;
    public boolean isIsactive() {
        return isactive;
    }
    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }
    @Column

    @JsonProperty("email")
    private String email;
    @Column

    @JsonProperty("password")
    private String password;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDate created;
    public LocalDate getCreated() {
        return created;
    }
    public void setCreated(LocalDate created) {
        this.created = created;
    }
    public LocalDate getModified() {
        return modified;
    }
    public void setModified(LocalDate modified) {
        this.modified = modified;
    }
    public LocalDate getLast_login() {
        return last_login;
    }
    public void setLast_login(LocalDate last_login) {
        this.last_login = last_login;
    }
    @Column
    private LocalDate modified;
    @Column
    private LocalDate last_login;

}