package br.com.repository;

import java.util.List;

public interface Repository<T> {

	public List<T> list();
	public T insert(T entity);
	public List<T> search(T entity);
}
