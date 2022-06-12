package companylisttest;

public class CompanyList {

    private Company[] companies;
    private Integer numberOfCompanies;
//    String companyName;
//    Integer turnover;

    public CompanyList(Integer companylistSize) {
        this.companies = new Company[companylistSize];
        this.numberOfCompanies = 0;
    }

    public void addCompany(String companyName, Integer turnover) {
        // no error checking so assumes banner id is unique and array won't overfill
        this.companies[this.numberOfCompanies] = new Company(companyName, turnover);
        this.numberOfCompanies++;
    }

//    public String toString() {
//        String companylistDetails = new String();
//        return (companyName + " " + turnover);
//    }
}
