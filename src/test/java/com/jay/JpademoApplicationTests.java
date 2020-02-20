package com.jay;

import com.jay.entity.Coffee;
import com.jay.entity.CoffeeOrder;
import com.jay.entity.OrderState;
import com.jay.repository.CoffeeOrderRepository;
import com.jay.repository.CoffeeRepository;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@SpringBootTest
//@EnableJpaRepositories
//@EnableTransactionManagement
public class JpademoApplicationTests {
//
//    @Autowired
//    private CoffeeRepository coffeeRepository;
//
//    @Autowired
//    private CoffeeOrderRepository orderRepository;

    @Test
    void contextLoads() {
//        initOrders();
//        findOrders();
    }

//
//    private void initOrders() {
//        Coffee coco = Coffee.builder().name("coco")
//                .price(Money.of(CurrencyUnit.of("CNY"), 20.0))
//                .build();
//        coffeeRepository.save(coco);
//        System.out.println("Coffee: { " + coco + " }");
//
//        Coffee latte = Coffee.builder().name("latte")
//                .price(Money.of(CurrencyUnit.of("CNY"), 25))
//                .build();
//        coffeeRepository.save(latte);
//        System.out.println("Coffee: { " + latte + " }");
//
//        //下订单
//        CoffeeOrder order = CoffeeOrder.builder().customer("Wang nima")
//                .items(Arrays.asList(coco, latte))
//                .state(OrderState.INIT)
//                .build();
//
//        orderRepository.save(order);
//        System.out.println("Order: { " + order + " }");
//
//        order = CoffeeOrder.builder().customer("Chris")
//                .items(Collections.singletonList(coco))
//                .state(OrderState.INIT)
//                .build();
//
//        orderRepository.save(order);
//        System.out.println("Order: { " + order + " }");
//
//    }
//
//    private void findOrders() {
////        for (Coffee coffee : coffeeRepository.findAll()) {
////            System.out.println("Loading : " + coffee);
////        }
//
//
//        System.out.println("findByItems_Name:  "+orderRepository.findByItems_Name("coco"));
//
//    }
}
