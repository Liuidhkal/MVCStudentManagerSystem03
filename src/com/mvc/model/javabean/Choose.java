package com.mvc.model.javabean;

import java.util.Objects;

public class Choose {
    private String chooseId;
    private String uSid;
    private String delSid;
    private Student stu;

    public Choose() {
    }

    public Choose(String chooseId) {
        this.chooseId = chooseId;
    }

    @Override
    public String toString() {
        return "Choose{" +
                "chooseId='" + chooseId + '\'' +
                ", uSid='" + uSid + '\'' +
                ", delSid='" + delSid + '\'' +
                ", stu=" + stu +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Choose choose = (Choose) o;
        return Objects.equals(chooseId, choose.chooseId) && Objects.equals(uSid, choose.uSid) && Objects.equals(delSid, choose.delSid) && Objects.equals(stu, choose.stu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chooseId, uSid, delSid, stu);
    }

    public String getChooseId() {
        return chooseId;
    }

    public void setChooseId(String chooseId) {
        this.chooseId = chooseId;
    }

    public String getuSid() {
        return uSid;
    }

    public void setuSid(String uSid) {
        this.uSid = uSid;
    }

    public String getDelSid() {
        return delSid;
    }

    public void setDelSid(String delSid) {
        this.delSid = delSid;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public Choose(String chooseId, String uSid, String delSid, Student stu) {
        this.chooseId = chooseId;
        this.uSid = uSid;
        this.delSid = delSid;
        this.stu = stu;
    }
}
