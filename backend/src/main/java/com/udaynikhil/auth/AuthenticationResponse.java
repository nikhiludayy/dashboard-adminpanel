package com.udaynikhil.auth;

import com.udaynikhil.customer.CustomerDTO;

public record AuthenticationResponse (
        String token,
        CustomerDTO customerDTO){
}
