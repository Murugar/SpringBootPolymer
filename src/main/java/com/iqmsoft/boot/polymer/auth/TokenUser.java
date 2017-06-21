package com.iqmsoft.boot.polymer.auth;

import org.springframework.security.core.authority.AuthorityUtils;

import com.iqmsoft.boot.polymer.domain.Role;
import com.iqmsoft.boot.polymer.domain.User;


public class TokenUser extends org.springframework.security.core.userdetails.User {
    private User user;

    public TokenUser(User user) {
        super(user.getUsername(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole().toString()));
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Long getId() {
        return user.getId();
    }

    public Role getRole() {
        return user.getRole();
    }
}
