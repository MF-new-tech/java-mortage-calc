package com.javamortgagecalc;

import java.text.NumberFormat;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();
        NumberFormat principalCurrency = NumberFormat.getCurrencyInstance();
        String principalResult = principalCurrency.format(principal);
        System.out.println("Principal:  " + principalResult);
    }
}
