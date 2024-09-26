/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class AccountDirectory {
    ArrayList<Account> accounts;
    
    public AccountDirectory() {
        accounts = new ArrayList<>();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    
    public Account addAccount(){
        Account account = new Account();
        this.accounts.add(account);
        return account;
    }
    
    public void deleteAccount(Account account){
        this.accounts.remove(account);
    }
    
    public Account searchAccount(String accountNumber){
        for(Account a:accounts){
            if (a.getAccountNumber().contains(accountNumber)){
                return a;
            }
        }
        return null;
    }
}
