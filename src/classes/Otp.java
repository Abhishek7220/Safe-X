/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.util.*;
/**
 *
 * @author Acer
 */ 
public class Otp {
    static char[] sendOTP(int length){
        System.out.println("Your Verification code hase been sent to your Email:");
        String numbers="0123456789";
        Random r=new Random();
        char[]otp=new char[length];
        for(int i=0;i<length;i++){
            otp[i]=numbers.charAt(r.nextInt(numbers.length()));
        }
        return otp;
    }
    public static void main(String[] args){
        System.out.println("generating otp...");
        System.out.println(sendOTP(4));
        
    } 
}
