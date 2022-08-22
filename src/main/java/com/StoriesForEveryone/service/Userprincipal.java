/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StoriesForEveryone.service;

import com.StoriesForEveryone.entity.Usuario;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author carlo
 */
public class Userprincipal implements UserDetails{
    private Usuario usuario;
 public Userprincipal(Usuario usuario) {
        this.usuario= usuario;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
           List<GrantedAuthority> authorities = new ArrayList<>();
        
        // Extract list of permissions(name)
            this.usuario.getPermissionList().forEach(p ->{
                GrantedAuthority authority = new SimpleGrantedAuthority(p);
                authorities.add(authority);
            });
            // Extract list of roles(ROLE_name)
            this.usuario.getRoleList().forEach(r ->{
                GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_"+ r);
                authorities.add(authority);
            });
            return authorities;
    }


    @Override
    public String getPassword() {
       return this.usuario.getPassword();
    }

    @Override
    public String getUsername() {
        return this.usuario.getNombre();
    }

    @Override
    public boolean isAccountNonExpired() {
      return true;
    }

    @Override
    public boolean isAccountNonLocked() {
              return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
              return true;
    }

    @Override
    public boolean isEnabled() {
            return this.usuario.getActive()==1;
    }
    
}
