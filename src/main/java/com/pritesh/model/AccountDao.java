package com.pritesh.model;


import org.springframework.lang.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_details")
public class AccountDao {

    @Id
    @Column(name = "account_number")
    private int accountNumber;

    @Column(name = "name")
    @NonNull
    private String Name;

    @Column(name = "address")
    private String address;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "available_balance")
    private int availableBalance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(int availableBalance) {
        this.availableBalance = availableBalance;
    }

    @Override
    public String toString() {
        return "AccountDao{" +
                "Name='" + Name + '\'' +
                ", address='" + address + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
