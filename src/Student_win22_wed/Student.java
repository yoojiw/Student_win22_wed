/*
Date : Jan 26th 2022
Author : Jiwoon Yoo
Comment : this is a comment
 */
package Student_win22_wed;

/**
 *
 * @author irene
 */
public class Student {
    private String studentId; 
    private String studentName;
    private String address;
 
    
    public Student(String studentId, String studentName){
      this.studentId = studentId; 
      this.studentName = studentName; 
      
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
    
    
    
    
}
