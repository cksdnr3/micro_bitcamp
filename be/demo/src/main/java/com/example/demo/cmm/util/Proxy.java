package com.example.demo.cmm.util;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.stereotype.Component;

import com.example.demo.bbs.domain.Article;
import com.example.demo.bbs.domain.Board;
import com.example.demo.sec.domain.Login;
import com.example.demo.uss.domain.Admin;
import com.example.demo.uss.domain.User;

@FunctionalInterface
interface BiFunction<T, U, R> {
	R apply(T t, U u);
}

@Component
public class Proxy {
	
	public Supplier<User> newUser = User::new;
	public Supplier<Admin> newAdmin = Admin::new;
	public Supplier<Board> newBoard = Board::new;
	public Supplier<Login> newLogin = Login::new;
	public Supplier<Article> newArticle = Article::new;
	
	public Consumer<String> print = System.out::print;
	
	public static Function<Object, String> toString = String::valueOf;
	public Function<String, Integer> strToInteger = Integer::parseInt;
	
	public Function<Integer, Integer> intAbs = Math::abs;
	public Function<Double, Double> doubleAbs = Math::abs;
	public Function<Float, Float> floatAbs = Math::abs;
	public Function<Long, Long> longAbs = Math::abs;

	public Function<Double, Double> ceil = Math::ceil;
	public Function<Double, Double> floor = Math::floor;
	
	public BiFunction<Integer, Integer, Integer> intMax = (f, s) -> Math.max(f, s);
	public BiFunction<Double, Double, Double> doubleMax = (f, s) -> Math.max(f, s);
	public BiFunction<Long, Long, Long> longMax = (f, s) -> Math.max(f, s);
	public BiFunction<Float, Float, Float> floatMax = (f, s) -> Math.max(f, s);
	
	public static BiFunction<Integer, Integer, Integer> rangeRandom = (f, s) -> (int)(Math.random() * (s - f)) + f + 1;
	
	public BiFunction<Integer, Integer, Integer> intMin = Math::min;
	public BiFunction<Long, Long, Long> longMin = Math::min; 
	public BiFunction<Double, Double, Double> doubleMin = Math::min; 
	public BiFunction<Float, Float, Float> floatMin = Math::min; 
	
	public Supplier<Double> random = Math::random;
	public Function<Double, Double> rint = Math::rint;
}
