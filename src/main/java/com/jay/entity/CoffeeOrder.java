package com.jay.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @program: jpademo
 * @description:
 * @author: Jaysrr
 * @create: 2020-02-17 18:54
 **/
@Entity
@Table(name = "T_ORDER")
@Data
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoffeeOrder extends BaseEntity implements Serializable {

    private String customer;

    @ManyToMany
    @JoinTable(name = "T_ORDER_COFFEE") //这相等于多对多里的中间表 联系了Cooffee和Order(订单)
    @OrderBy("id")
    private List<Coffee> items;

    @Column(nullable = false)
    @Enumerated
    private OrderState state;

}
