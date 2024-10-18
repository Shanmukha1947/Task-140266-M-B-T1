package com.example.application.ui;

import com.example.application.repository.DatabaseManager;
import com.example.application.service.CustomerService;
import com.example.application.domain.Customer;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        customerService.addCustomer(new Customer());

        DatabaseManager databaseManager = new DatabaseManager();
        databaseManager.connect();
    }
}

