package com.springTest.hibernate.form;

import com.springTest.hibernate.annotation.phone;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class Testphone {

    @phone(message = "doit etre un nombre, sa taille est entre >=10 et <=14")
    private String tel;

    private int code;
    private Date naissance;

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }
}
