package com.example.neusoftfood_17110100219gcy.beans;

public class UserBean {
    /**
     * user_id : 1
     * username : lnn
     * userpass : 6512bd43d9caa6e02c990b0a82652dca
     * mobilenum :  13476543211
     * address : å¤§è¿
     * comment : 测试
     */

    private String userid;
    private String username;
    private String userpass;
    private String mobilenum;
    private String address;
    private String comment;

    public void setUser_id(String userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public void setMobilenum(String mobilenum) {
        this.mobilenum = mobilenum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUser_id() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getUserpass() {
        return userpass;
    }

    public String getMobilenum() {
        return mobilenum;
    }

    public String getAddress() {
        return address;
    }

    public String getComment() {
        return comment;
    }
}
