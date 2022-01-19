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
public class Student {
    private String studentId; 
    private String studentName;
    
    public Student(String sid, String sname){
      this.studentId = sid; 
      this.studentName = sname; 
      
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
    
    
    
    
}
