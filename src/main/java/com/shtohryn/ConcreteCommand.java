package com.shtohryn;

import java.util.Scanner;

public class ConcreteCommand implements Command {

    static Scanner scanner = new Scanner(System.in);

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        while (true) {
            System.out.println("1- Work with numbers");
            System.out.println("2- Work with array");
            String s = scanner.nextLine();
            switch (s) {
                case "1":
                    System.out.println("Enter two values: ");
                    System.out.print("a= ");
                    int a = scanner.nextInt();
                    System.out.print("b= ");
                    int b = scanner.nextInt();
                    System.out.println(receiver.numbersComparator(a, b) + "- biggest");
                    System.out.println("'a' and 'b' average= " + receiver.numbersAverage(a, b));
                    break;
                case "2":
                    receiver.taskWithArray();
                    break;
                case "0":
                    System.exit(0);
            }

        }
    }
}