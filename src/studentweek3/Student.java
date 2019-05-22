package studentweek3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
public class Student {
    
    private int Id;
    private String firstname;
    private int MaxCourse;
    private boolean PartTime;

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    
    public String getFirstname() {
        return firstname;
    }

    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the PartTime
     */
    public boolean isPartTime() {
        return PartTime;
    }

    /**
     * @param PartTime the PartTime to set
     */
    public void setPartTime(boolean PartTime) {
        this.PartTime = PartTime;
    }

    
}
