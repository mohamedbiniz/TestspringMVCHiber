package com.springTest.hibernate.form;

//@MatchedField(base=, confirmed=)
public class userForm {
    //@NotBlank
    //@size(min=5)
    private String username;
    //@Email
    private  String email;
    private String password;
    private String confPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getConfPassword() {
        return confPassword;
    }

    public void setConfPassword(String confPassword) {
        this.confPassword = confPassword;
    }
}
