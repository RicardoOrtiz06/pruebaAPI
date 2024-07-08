package com.api.crud.models;


import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="usuario")

/**
 *
 * @author ricar
 */

public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column (name = "idUsuario", nullable = false)
    private Long id;

    @Column(name = "nombreUsuario")
    private String userName;
    
    @Column(name = "contraseña")
    private String userPassword;

    @Column(name = "tipo")
    private String UserType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String userType) {
        UserType = userType;
    }

    

}
