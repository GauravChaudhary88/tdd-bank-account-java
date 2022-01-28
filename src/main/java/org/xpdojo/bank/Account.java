package org.xpdojo.bank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private double balance;
    private boolean status;

    public Account() {
        balance = 0;
        status = true;
    }


    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public boolean withdraw(double amount)
    {
        if(amount>=balance){
            balance = balance - amount;
            return true;
        }
        else{
            return false;
        }

    }

    public void disable()
    {
        status = false;
    }

    public void enable()
    {
        status = true;
    }


    public double getBalance()
    {
        return balance;
    }

    public boolean printBalance()
    {
        if(status){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            System.out.println("Your Account Balance is: "+balance+" Euros on "+dateFormat.format(date));
            return true;
        }else{
            return false;
        }

    }

}
