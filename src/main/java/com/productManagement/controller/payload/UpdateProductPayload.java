package com.productManagement.controller.payload;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UpdateProductPayload(
        @NotNull
        @Size(min = 3, max = 100)
        String title,

        @Size(max = 500)
        String details) {
}