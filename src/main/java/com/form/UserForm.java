package com.form;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserForm {

    private Long id;

    @NotBlank(message = "名字不能為空")
    private String name;

    @NotBlank(message = "密碼不能為空")
    @Length(min=6,message = "密碼長度必須大於6")
    private String password;

    @Email
    @NotBlank(message = "E-mail不能為空")
    private String email;

    public UserForm() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
