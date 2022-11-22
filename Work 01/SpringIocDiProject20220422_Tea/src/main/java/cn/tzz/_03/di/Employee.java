package cn.tzz._03.di;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class Employee {
    private String name;
    private int age;
    private BigDecimal salary;
}
