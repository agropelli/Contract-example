package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contract;

public class Program{

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Enter the contract info: ");
        System.out.print("Contract number:   ");
        int number = sc.nextInt();
        System.out.print(" Date (dd/MM/yyyy):  ");
        LocalDate date = LocalDate.parse(sc.next(),fmt);
        System.out.print("Contract amount:  ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number,date,totalValue);

        System.out.print("Enter number of Installments:  ");
        int n = sc.nextInt();
        

        








        sc.close();
    }
}