package com.Apartments.apartments.services;

import com.Apartments.apartments.entity.User;
import com.Apartments.apartments.gateway.GatewayServices;
import org.springframework.scheduling.annotation.Scheduled;

public class GatewayImplementation implements GatewayServices
{
    @Override
    public boolean Authenticated(User username, String password) {
        return false;
    }

    @Override
    public boolean Authorized(boolean status) {
        return false;
    }
    // Sets a time limit for how long the api can be accessed
    @Scheduled()
    @Override
    public int AuthorizatedWindow() {
        return 0;
    }
}
