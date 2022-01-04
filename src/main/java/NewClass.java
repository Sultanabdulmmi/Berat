
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sulta
 */
public class NewClass 
{
public static void main(String[] args) 
{
System.out.print("Masukkan massa dalam kilogram : ");

Scanner input = new Scanner(System.in); 

double kg = input.nextDouble();

double ton = kg/1000;

double kuintal = kg/100;

double g = kg*1000;

double mg = g*1000;

double μg = mg*1000;

double pon = kg*2.20462;

double ons = kg*35.2739199982575;

System.out.println(kg + " kilogram sama dengan : \n" + ton + " ton\n" + kuintal + " kuintal\n" + g + " g\n" + mg + " mg\n" + μg + " μg\n" + pon + " pon\n" + ons + " ons\n");

}

}
