/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_win22_wed;

/**
 *
 * @author irene
 */
public class PartTimeStudent extends Student{
    private int numCourse; 

    public PartTimeStudent(String studentId, String studentName) {
        super(studentId, studentName);  //call the contructor of Student class 
        this.numCourse = numCourse; 
    }

    public int getNumCourse() {
        return numCourse;
    }

    public void setNumCourse(int numCourse) {
        this.numCourse = numCourse;
    }
    
    
}
