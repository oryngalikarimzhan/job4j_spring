package ru.job4j.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
@Scope("prototype")
public class ConsoleInput {

    private Scanner scanner = new Scanner(System.in);

    public String askStr() {
        System.out.print("enter something  ");
        return scanner.nextLine();
    }
}