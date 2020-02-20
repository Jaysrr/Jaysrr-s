package com.jay;

import com.jay.entity.Coffee;
import com.jay.entity.CoffeeOrder;
import com.jay.entity.OrderState;
import com.jay.repository.CoffeeOrderRepository;
import com.jay.repository.CoffeeRepository;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@EnableJpaRepositories
@EnableTransactionManagement
@SpringBootApplication
public class JpademoApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(JpademoApplication.class, args);
    }

    @Autowired
    private CoffeeRepository coffeeRepository;

    @Autowired
    private CoffeeOrderRepository orderRepository;

    @Override
    @Transactional//这个没加 即使再类上加了@@EnableTransactionManagement也没用！！！
    public void run(ApplicationArguments args) throws Exception {
        initOrders();
        findOrders();
    }

    private void initOrders() {
        Coffee coco = Coffee.builder().name("coco")
                .price(Money.of(CurrencyUnit.of("CNY"), 20.0))
                .build();
        coffeeRepository.save(coco);
        System.out.println("Coffee: { " + coco + " }");

        Coffee latte = Coffee.builder().name("latte")
                .price(Money.of(CurrencyUnit.of("CNY"), 25))
                .build();
        coffeeRepository.save(latte);
        System.out.println("Coffee: { " + latte + " }");

        //下订单
        CoffeeOrder order = CoffeeOrder.builder().customer("Wang nima")
                .items(Arrays.asList(coco, latte))
                .state(OrderState.INIT)
                .build();

        orderRepository.save(order);
        System.out.println("Order: { " + order + " }");

        order = CoffeeOrder.builder().customer("Chris")
                .items(Collections.singletonList(coco))
                .state(OrderState.INIT)
                .build();

        orderRepository.save(order);
        System.out.println("Order: { " + order + " }");

    }

    private void findOrders() {
//        for (Coffee coffee : coffeeRepository.findAll()) {
//            System.out.println("Loading : " + coffee);
//        }
//        List<CoffeeOrder> list2 = orderRepository.findTop3ByOrderUpdateTimeDescIdAsc();
//        System.out.println("findTop3ByOrderByUpdateTimeDescIdAsc:" + getJoinedOrderId(list2));

//        List<CoffeeOrder> list1 = orderRepository.findByCustomerOrderById("Wang nima");
//        System.out.println("findByCustomerOrderById: " + getJoinedOrderId(list1));

        List<CoffeeOrder> list5 = orderRepository.findByCustomerLike("Wang");
        System.out.println("findByCustomerOrderById: " + getJoinedOrderId(list5));


//                 List<CoffeeOrder> list1 = orderRepository.findCoffeeOrdersByCustomerIsLike("Wang nima");
//        System.out.println("findCoffeeOrdersByCustomerIsLike: " + list1);

//        List<CoffeeOrder> listByItemName = orderRepository.findByItems_Name("coco");
//
//        System.out.println("findByItems_Name:  " + getJoinedOrderId(list));

        // 输出通过itemName查找到的订单
//        for (int i = 0; i < listByItemName.size(); i++) {
//            CoffeeOrder order = listByItemName.get(i);
//            for (Coffee item : order.getItems()) {
//                System.out.println("Item " + order.getId() +":"+ item);
//            }
//        }
//        System.out.println("findByItems_Name:  " + listByItemName);
    }

    private String getJoinedOrderId(List<CoffeeOrder> list) {
        return list.stream().map(o -> o.getId().toString())
                .collect(Collectors.joining(","));
    }


}
