/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciklusok;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author patri
 */
public class Ciklusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        
        
        List<String> nevek = new ArrayList<>();
        
        nevek.add("Lajos");
        nevek.add("Béla");
        nevek.add("Kevin");
        nevek.add("Minea");
        
        for(int i = 0; i < nevek.size(); i++){
            System.out.println(nevek.get(i));
        }
        int ketto = 2;
        for(int i = 0; i <= 5; i++){
            if(i == 0){
                System.out.println("1");
            }
            else{
                ketto = ketto * 2;
                System.out.printf("%d. hatvány = %d\n", i,ketto);
                ketto = ketto * 2;
            }
        }
        
        
        for(int i = 5; i > 0; i--){
            System.out.println(i);
        }
        
        for(int i = 1; i < 11; i++){
             if(i % 2  != 0){
                 System.out.println(i);
             }
        }
        
        for(int i = 1; i < 11; i+=2){
            System.out.println(i);
        }
        
        
        List<String> gyumolcsok = List.of("alma","körte","ananász");
        
        for(String gyumolcs : gyumolcsok){
            System.out.println(gyumolcs);
        }
        
        int szam = 1;
        while(szam <= 10){
            System.out.println(szam);
            szam++;
        }
        int a = 0;
        while(true){
            System.out.println("Beragadtam");
            a++;
            if(a == 5){
                break;
            }
        }
        
        
        System.out.println("Kérek egy számot:");
        
        Scanner be = new Scanner(System.in);
        
        int num = be.nextInt();
        
        while(num != 0){
            System.out.println("Kérek egy számot");
            num = be.nextInt();
        }
        
        int num2;
        do{
            System.out.println("Kérek egy számot");
            num2 = be.nextInt();
        }while(num2 != 0);
        
        
        System.out.println("Adj meg egy számot");
        Scanner n = new Scanner(System.in);
        int nn = n.nextInt();
        
        for(int i = 0; i < nn; i++){
            System.out.println(i+10);
        }
        
        List<Integer> szamok = List.of(1,2,3,4,5,12,-25);
        
        //Summa
        
        int osszeg = 0;
        
        for(int i = 0; i < szamok.size(); i++){
            osszeg = osszeg + szamok.get(i);
        }
        System.out.println(osszeg);
                
        
        int db = 0;
        for(int i = 0; i > szamok.size(); i++){
            if(szamok.get(i) == 10);    
            db++;
        }
        System.out.println(db);
        
        
        int min = szamok.get(0);
        for(int i = 0; i < szamok.size(); i++){
            if(min > szamok.get(i)){
                min = szamok.get(i);
            }
        }
        System.out.println(min);
        
        
        int max = szamok.get(0);
        for(int i = 0; i < szamok.size(); i++){
               if(max < szamok.get(i)){
                   max = szamok.get(i);
               }
        }
        System.out.println(max);
        
        //van e páros szám a listában
        boolean van = false;
        for(int i = 0; i < szamok.size(); i++){
            if(szamok.get(i) % 2 == 0){
                van = true;
                break;
            }
        }
        System.out.println(van);
    }
    
}
