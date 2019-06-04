package com.example.project2_realm_revision;

import io.realm.RealmObject;

public class Student extends RealmObject {

    private int userid;
    private String username;
    private String lastname;

    public Student(){

    }

    public Student(int userid, String username, String lastname) {
        this.userid = userid;
        this.username = username;
        this.lastname = lastname;
    }

    public int getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getLastname() {
        return lastname;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
