package com.healthify.womenhealthify;

import com.healthify.womenhealthify.Models.CustomerUserDetails;
import com.healthify.womenhealthify.Models.User;
import com.healthify.womenhealthify.Repositories.Userrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomerUserDetailsService implements UserDetailsService {
    
    @Autowired
    private Userrepository repo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
        User user = repo.findByEmail( email);
        if(user == null){
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomerUserDetails(user);
    }
    
}
