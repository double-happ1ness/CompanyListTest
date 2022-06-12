package companylisttest;

import java.util.Scanner;

public class CompanyListTest {

    public static void main(String[] args) {
        Integer companylistSize = Input.getInteger("companylist size: ");
        Integer option;
        String companyName;
        Integer turnover;
        CompanyList companylist = new CompanyList(companylistSize);

        do {
            System.out.println("0: quit");
            System.out.println("1: add company");
            System.out.println("2: display companies");
            option = Input.getInteger("option: ");
            switch (option) {
                case 0:
                    System.out.println("quitting program");
                    break;
                case 1:
                    companyName = Input.getString("title: ");
                    turnover = Input.getInteger("turnover: ");
                    companylist.addCompany(companyName, turnover);
                    break;
                case 2:
                    System.out.println(companylist);
                    break;
                default:
                    System.out.println("invalid option");

            }
        } while (option != 0);
    }

//code goes here
}
