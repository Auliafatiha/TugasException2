/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Excep {
 public static void main (String args[]){
     Scanner sc = new Scanner (System.in);
 
      System.out.println("Identitas");
      System.out.print("Masukkan nama: ");
      String name = sc.nextLine();
         if(name.matches(".*\\d.*")){
         System.out.println("Nama tidak boleh mengandung unsur angka, ulangi inputan!!");
                   
       }else{
           System.out.println("Nama valid dan sesuai " + name);
       }
            int age = 0;
     
  try{ 

      System.out.print("Masukkan Umur: ");
      age = sc.nextInt();
      if (age < 0){
          throw new IllegalArgumentException("umur tidak boleh bernilai negatif");
      }else{
           System.out.println("umur valid " + age);
      }

     }catch(IllegalArgumentException ae){ 
        System.out.println("Exception thrown: " + ae); 
     }catch(Exception e){
          System.out.println("Exception thrown: " + e.getMessage()); 
     }
  
   System.out.println("Nama: " + name + " Umur: " + age);
   
 }
 }


     
 
         

         

    

