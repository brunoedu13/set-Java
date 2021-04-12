package application;


import entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Set<Student> set = new HashSet<>();


        System.out.print("How many students for course A? ");
        Integer nStudents = sc.nextInt();
        for(int i=0; i<nStudents; i++){
            Integer id = sc.nextInt();
            set.add(new Student(id));
        }
        System.out.print("How many students for course B? ");
        nStudents = sc.nextInt();
        for(int i=0; i<nStudents; i++){
            Integer id = sc.nextInt();
            set.add(new Student(id));
        }

        System.out.print("How many students for course C? ");
        nStudents = sc.nextInt();
        for(int i=0; i<nStudents; i++){
            Integer id = sc.nextInt();
            set.add(new Student(id));
        }

        System.out.println();
        System.out.println("Total Students: " + set.size());










        sc.close();







    }






}
