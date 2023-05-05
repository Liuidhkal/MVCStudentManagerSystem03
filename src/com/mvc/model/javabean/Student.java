package com.mvc.model.javabean;

import java.util.Date;
import java.util.Objects;

public class Student {
    private Integer id;
    private String sid;
    private String name;
    private Date birthday;

    public Student() {
    }

    public Student(String sid, String name, Date birthday) {
        this.sid = sid;
        this.name = name;
        this.birthday = birthday;
    }

    public Student(Integer id, String sid, String name, Date birthday) {
        this.id = id;
        this.sid = sid;
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(sid, student.sid) && Objects.equals(name, student.name) && Objects.equals(birthday, student.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sid, name, birthday);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
