package com.example.demo.bbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.bbs.domain.Article;
import com.example.demo.bbs.repository.ArticleRepository;
import com.example.demo.cmm.service.AbstractService;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class ArticleServiceImpl extends AbstractService<Article> implements ArticleService{
	private final ArticleRepository repo;
	@Override
	public long count() {
		return repo.count();
	}

	@Override
	public boolean existsById(long id) {
		return repo.existsById(id);
	}

	@Override
	public List<Article> findAll() {
		return repo.findAll();
	}

	@Override
	public Optional<Article> findOne() {
		return repo.findOne(null);
	}

	@Override
	public void deleteById(long id) {
		repo.deleteById(id);
	}

	@Override
	public Article getOne(long id) {
		return repo.getOne(id);
	}

	@Override
	public Article save(Article entity) {
		return repo.save(entity);
	}

}
