package companylisttest;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Company {
    
    private String companyName;
    private Integer turnover;

    public Company(String companyName, Integer turnover){
        this.companyName=companyName;
        this.turnover=turnover;
    }
	
    public void changeArtist(String newcompanyName){
        this.companyName=newcompanyName;
    }
	
    public Boolean matchFound(Integer turnover){
        return this.turnover.equals(turnover);
    }

    public String toString(){
        return "Company name: "+this.companyName+" turnover: "+this.turnover;
    }
    
}
