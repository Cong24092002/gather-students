package com.gather_students.homwork.model;

import com.sun.source.doctree.IndexTree;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "student")
public class Student {
//    +------+-------------+----------+-----------+-------+--------------------+------+-------+------+------+-------------+--------+----------------------------------+------------+------+------+------+------+------+--------+------+----------------------------+
//            | stt  | school      | distric  | studentID | class | name               | day  | month | year | sex  | countryside | ethnic | household                        | phone      | p1   | p2   | p3   | p4   | p5   | uuTien | sumP | comment                    |
//            +------+-------------+----------+-----------+-------+--------------------+------+------

    private Integer stt;
    private String school;
    private String distric;
    @Id
    @Column(name = "studentID") // lien ket toi cac truong cua co so du lieu...
    // Neu field cua class khong trung voi ten truong cua csdl
    private String studentID;
    @Column(name = "class")
    private String iClass;
    private String name;
    private Integer day;
    private Integer month;
    private Integer year;
    private String sex;
    private String countryside;
    private String ethnic;
    private String household;
    private String phone;
    private Integer p1,p2,p3,p4,p5,uuTien,sumP;
    private String comment;

    public Student(Integer stt, String school, String distric, String studentID, String iClass, String name, Integer day, Integer month,
                   Integer year, String sex, String countryside, String ethnic, String household, String phone,
                   Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer uuTien, Integer sumP, String comment) {
        this.stt = stt;
        this.school = school;
        this.distric = distric;
        this.studentID = studentID;
        this.iClass = iClass;
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.sex = sex;
        this.countryside = countryside;
        this.ethnic = ethnic;
        this.household = household;
        this.phone = phone;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.uuTien = uuTien;
        this.sumP = sumP;
        this.comment = comment;
    }
    public Student(){}

    public Integer getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDistric() {
        return distric;
    }

    public void setDistric(String distric) {
        this.distric = distric;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountryside() {
        return countryside;
    }

    public void setCountryside(String countryside) {
        this.countryside = countryside;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public Integer getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public Integer getP3() {
        return p3;
    }

    public void setP3(int p3) {
        this.p3 = p3;
    }

    public Integer getP4() {
        return p4;
    }

    public void setP4(int p4) {
        this.p4 = p4;
    }

    public Integer getP5() {
        return p5;
    }

    public void setP5(int p5) {
        this.p5 = p5;
    }

    public Integer getUuTien() {
        return uuTien;
    }

    public void setUuTien(int uuTien) {
        this.uuTien = uuTien;
    }

    public Integer getSumP() {
        return sumP;
    }

    public void setSumP(int sumP) {
        this.sumP = sumP;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getIClass(){
        return iClass;
    }
    public void setIClass(String iClass){
        this.iClass = iClass;
    }
}
