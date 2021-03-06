package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.uss.domain.User;
import com.example.demo.uss.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class UserServiceImpl extends AbstractService<User> implements UserService {
	private final UserRepository repo;

	@Override
	public long count() {
		return repo.count();
	}

	@Override
	public boolean existsById(long id) {
		return repo.existsById(id);
	}

	@Override
	public List<User> findAll() {
		return repo.findAll();
	}

	@Override
	public Optional<User> findOne() {
		return repo.findOne(null);
	}

	@Override
	public void deleteById(long id) {
		repo.deleteById(id);
	}

	@Override
	public User getOne(long id) {
		return repo.getOne(id);
	}

	@Override
	public User save(User entity) {
		return repo.save(entity);
	}


}
