
package entity;

public class Customer {
    private String firstname;
    private String lastname;
    private int birthday;
    private int customerCash;
    
    public Customer() {
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
    public int getCustomerCash(){
        return customerCash;
    }
    public void setCustomerCash(int cash){
        this.customerCash=cash;
    }
    @Override
    public String toString() {
        return "Customer{" + 
                "firstname=" + firstname + 
                ", lastname=" + lastname + 
                ", birthday=" + birthday + 
                ", cash=" + customerCash + '}';
    }

}