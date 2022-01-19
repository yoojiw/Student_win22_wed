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
public class StudentList {
    public static void main(String args[]){
        Student[] StudentList = new Student[3];
        StudentList[0] = new Student("s1", "James");
        StudentList[1] = new Student("s2", "Tom");
        StudentList[2] = new Student("s3", "Kate");
        
        for(int i = 0; i < StudentList.length; i++){
            System.out.println(StudentList[i].getStudentId());
            System.out.println("");
            System.out.println(StudentList[i].getStudentName());
            
        }  
        
               
    }
}
