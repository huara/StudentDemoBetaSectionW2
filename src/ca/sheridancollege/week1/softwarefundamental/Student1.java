/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamental;

/**
 *
 * @author mehta
 */
public class Student1 {

    private String name;
    private int studentID;
    private int studentAge;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param givenName the name to set
     */
    public void setName(String givenName) {
            name = givenName;
    }

    /**
     * @return the studentID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /**
     * @return the studentAge
     */
    public int getStudentAge() {
        return studentAge;
    }

    /**
     * @param studentAge the studentAge to set
     */
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
    
}
