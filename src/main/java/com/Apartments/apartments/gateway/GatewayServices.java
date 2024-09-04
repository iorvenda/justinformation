package com.Apartments.apartments.gateway;

import com.Apartments.apartments.entity.User;

public interface GatewayServices
{
    public boolean Authenticated(User username, String password);
    public boolean Authorized(boolean status);
    public int AuthorizatedWindow();

}
