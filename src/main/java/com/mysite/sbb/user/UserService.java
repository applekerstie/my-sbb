package com.mysite.sbb.user;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	
	public SiteUser create(String username, String email, String password) {
		SiteUser user = new SiteUser();
		user.setUsername(username);
		user.setEmail(email);
		
		//BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		user.setPassword(passwordEncoder.encode(password));
		
		this.userRepository.save(user);
		return user;
	}
	
	public Optional<SiteUser> findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	
	public List<SiteUser> findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
}
