package com.example.demo.bbs.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.bbs.domain.Board;

public interface BoardService {
	public long count();
	public boolean existsById(long id);
	public List<Board> findAll();
	public Optional<Board> findOne();
	public void deleteById(long id);
	public Board getOne(long id);
	public Board save(Board entity);
}
