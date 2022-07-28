package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;

public class GameAuthorizer implements Authorizer<GameUser> 
{
    @Override
    public boolean authorize(GameUser user, String role) {
    	
        // FIXME: Finish the authorize method based on BasicAuth Security Example
    	/*
    	 * C. Trimmer: This is the custom authorizer
    	 * It is responsible for matching the roles and deciding
    	 * whether user is allowed to perform certain action or not
    	 */
    	return user.getRoles() != null && user.getRoles().contains(role);
    }
}