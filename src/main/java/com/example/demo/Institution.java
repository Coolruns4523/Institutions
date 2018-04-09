package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Institution {

    public static void main(String[] args) {


        boolean stop = false;
        String answer =" no";
        School school = new School();

        Scanner keyboard = new Scanner(System.in);

        ArrayList <Course>titles = new ArrayList<>();


            System.out.println("Enter in details about your courses: ");

            System.out.println("Enter name of the School: ");
            school.setInstitute(keyboard.nextLine());

         do{
             Course crs = new Course();
             System.out.println("Enter details about your Course:");

             System.out.println("Enter course title: ");
             crs.setTitle(keyboard.nextLine());
             System.out.println("Enter course number: ");
             crs.setClassNumber(keyboard.nextLine());
             System.out.println("Enter course room number: ");
             crs.setRoomNumber(keyboard.nextLine());
             titles.add(crs);

             System.out.println("Would you like to add more courses? ");
             answer = keyboard.nextLine();
             if(answer.equalsIgnoreCase("no"))
                 stop=true;
         }while (!stop);



         System.out.println("These are the course you have entered:");
        System.out.println("************************************************************");
        System.out.println("SCHOOL INFORMATION:");
        System.out.println("************************************************************");
        System.out.println("School name:"+ school.getInstitute());
        System.out.println("************************************************************");

        System.out.println("************************************************************");
        System.out.println("COURSE INFORMATION");
        System.out.println("************************************************************");
        for(Course eachTitle : titles)
        {
            System.out.println("Course Name: " +eachTitle.getTitle());
            System.out.println("Course Number: " +eachTitle.getClassNumber());
            System.out.println("Course: " +eachTitle.getRoomNumber());
        }


        }
}
