package com.udaynikhil.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}
