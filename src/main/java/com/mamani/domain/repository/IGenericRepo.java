package com.mamani.domain.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

@NoRepositoryBean
public interface IGenericRepo<T,ID> extends ReactiveCrudRepository<T,ID> {
}
