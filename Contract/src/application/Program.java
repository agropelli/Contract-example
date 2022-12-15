package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;

public class Program{

    /**
     * @param args
     */
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
        ContractService contractService = new ContractService(null);

        ContractService.processContract(contract,n);
        System.out.println("Payments: ");
        for (Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }
        

        








        sc.close();
    }
}