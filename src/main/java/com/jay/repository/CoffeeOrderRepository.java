package com.jay.repository;


import com.jay.entity.CoffeeOrder;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CoffeeOrderRepository extends BaseRepository<CoffeeOrder, Long> {
    //自定义模糊查询
    @Query(value = "select * from T_Order  o  where o.customer  like concat('%',:customer,'%') ", nativeQuery = true)
    List<CoffeeOrder> findByCustomerLike(String customer);
    //jpa模糊查询
//    List<CoffeeOrder> findCoffeeOrdersByCustomerIsLike(String customer);
    //    @Query(value = "select * from T_ORDER   where  customer=:customer", nativeQuery = true)
//    List<CoffeeOrder> findByCustomerOrderById(@Param("customer") String customer);

    //Caused by: org.springframework.data.mapping.PropertyReferenceException: No property selectByItems found for type CoffeeOrder!
//    List<CoffeeOrder> selectByItems_Name(String itemName);

//    List<CoffeeOrder> findByItems_Name(String itemName);
}
