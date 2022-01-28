package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
	@Disabled
    public void depositAnAmountToIncreaseTheBalance() {
        Account a = new Account();
        a.deposit(100);

        assertThat(a.getBalance()).isEqualTo(100);
    }

    public void withdrawAnAmountInsufficientBalance() {

        Account a = new Account();
        //a.deposit(100);


        assertThat(a.withdraw(10)).isEqualTo(false);

    }

    public void withdrawAnAmountSufficientBalance() {

        Account a = new Account();
        a.deposit(100);


        assertThat(a.withdraw(10)).isEqualTo(true);

    }

    public void displayClosedAccount () {

        Account a = new Account();
        a.disable();
        assertThat(a.printBalance()).isEqualTo(false);

    }

    public void displayOpenedAccount () {

        Account a = new Account();
        assertThat(a.printBalance()).isEqualTo(true);

    }
}
