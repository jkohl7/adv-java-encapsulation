package edu.wctc.property.lab1;

import java.time.LocalDate;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a constructor
 * to enforce that. Review the tips in the document "EncapCheckList.pdf" if
 * needed.
 *
 * @author Jim Lombardo
 * @version 1.02
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private int cubeId;
    private LocalDate orientationDate;


    public Employee(String firstName, String lastName, String ssn, int cubeId) {

        if(ssn.length() != 9){
            throw new IllegalArgumentException("This is whack");
        }

        this.firstName = firstName;
        this.lastName = lastName;

        this.metWithHr = false;
        this.metDeptStaff = false;
        this.reviewedDeptPolicies = false;
        this.movedIn = false;

    }

    //ways to turn booleans true
    public void didHrMeeting(){
        metWithHr = true;
    }
    public void didDSMeeting(){
        metDeptStaff = true;
    }
    public void reviewPolicies(){
        reviewedDeptPolicies = true;
    }
    public void movedBelongings(){
        movedIn = true;
    }





    //setters and getters

    public LocalDate getOrientationDate() {
        return orientationDate;
    }

    public void setOrientationDate(LocalDate orientationDate) {
        this.orientationDate = orientationDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
