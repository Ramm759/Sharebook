package com.mycompany.sharebook.backend.configuration;

import com.mycompany.sharebook.backend.entity.User;
import com.mycompany.sharebook.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        List<User> users = userRepository.findByEmail(login);
        if (users.isEmpty()) {
            throw new UsernameNotFoundException(login);
        }
        return new UserPrincipal(users.get(0));
    }

    public static class UserPrincipal implements UserDetails {
        private final User user;

        public UserPrincipal(User user) {
            this.user = user;
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            // Pas utilisé dans l'application mais indispensable pour Spring Security
            final List<GrantedAuthority> authorities = new ArrayList();
            authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
            return authorities;
        }

        @Override
        public String getPassword() {
            return user.getPassword();
        }

        @Override
        public String getUsername() {
            return user.getEmail(); // email est utilisé comme login
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
            return true;
        }
    }
}
