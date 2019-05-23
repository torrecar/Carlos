/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 May 23, 2019*/
package student;

/**
 *
 * @author store
 */
public class Student {

   
    public static void main(String[] args) {
        
        
        Student s1 =  new Student();
        s1.setName("carlos");
        //System.out.print(s1.getName());
        
        Student s2 = new Student();
        s2.setName("micka");
        
        Student s3 = new Student();
        s3.setName("hena");
        
        //array of objects
        Student[] list = new Student[3];
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
   
        
        //print
        for(int i=0; i<list.length; i++) {
            System.out.println(list[i].getName());
        }
        
    }

}
