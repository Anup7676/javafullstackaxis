package com.anup;

import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=scan.nextInt();
        if(year<=2023 || year>=2000){
            if(2023-year>=23){
                System.out.println("good");
            }
            
        }
    }
}
