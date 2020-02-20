package com.jay.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * @program: jpademo
 * @description: spring不需要为此repository创建bean
 * @author: Jaysrr
 * @create: 2020-02-18 14:54
 **/
@NoRepositoryBean// 表示spring不需要为此repository创建bean
public interface BaseRepository<T, Long> extends PagingAndSortingRepository<T, Long> {
    //    findTop3By的By是说明这是个查询方法，虽然没有By具体的东西
//    List<T> findTop3ByOrderUpdateTimeDescIdAsc();
}

