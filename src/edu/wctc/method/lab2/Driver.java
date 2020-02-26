package edu.wctc.method.lab2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Driver {
    public static void main(String[] args) {
        Employee e = new Employee("Jacob", "Kohl", "123456789");
        e.order();
    }
}
