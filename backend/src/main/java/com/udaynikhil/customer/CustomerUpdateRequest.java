package com.udaynikhil.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
