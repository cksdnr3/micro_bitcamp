package com.example.demo.bbs.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.bbs.domain.Article;

public interface ArticleService {
	public long count();
	public boolean existsById(long id);
	public List<Article> findAll();
	public Optional<Article> findOne();
	public void deleteById(long id);
	public Article getOne(long id);
	public Article save(Article entity);
}
