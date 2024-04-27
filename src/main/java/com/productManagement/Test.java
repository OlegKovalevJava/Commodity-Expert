package com.productManagement;

import com.productManagement.controller.payload.NewProductPayload;

public class Test {
    public static void main(String[] args) {
        NewProductPayload payload = new NewProductPayload("Coffee", "Black");
        System.out.println(payload.title() + " " + payload.details());

    }
}
