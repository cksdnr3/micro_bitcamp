package com.example.demo.bbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.bbs.domain.Board;
import com.example.demo.bbs.repository.BoardRepository;
import com.example.demo.cmm.service.AbstractService;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class BoardServiceImpl extends AbstractService<Board> implements BoardService{
	private final BoardRepository repo;
	
	@Override
	public long count() {
		return repo.count();
	}

	@Override
	public boolean existsById(long id) {
		return repo.existsById(id);
	}

	@Override
	public List<Board> findAll() {
		return repo.findAll();
	}

	@Override
	public Optional<Board> findOne() {
		return repo.findOne(null);
	}

	@Override
	public void deleteById(long id) {
		repo.deleteById(id);
	}

	@Override
	public Board getOne(long id) {
		return repo.getOne(id);
	}

	@Override
	public Board save(Board entity) {
		return repo.save(entity);
	}

}
