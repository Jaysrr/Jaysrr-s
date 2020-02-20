package com.jay.repository;

import com.jay.entity.Coffee;
import org.springframework.data.repository.CrudRepository;

/**
 * @program: jpademo
 * @description: 继承crudrepository
 * @author: Jaysrr
 * @create: 2020-02-18 12:59
 **/

public interface CoffeeRepository extends BaseRepository<Coffee, Long> {
}
