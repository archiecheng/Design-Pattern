package _01singleresponsibility;

/**
 * @author Archie Cheng
 * @version V1.0.0
 * @projectName Design Pattern
 * @title SingleResponsibility1
 * @package singleresponsibility
 * @description
 * @date 2024/5/8 11:32
 * @copyright 2024
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

// 交通工具类
// 方式1
// 1. 在方式1的 run 方法中, 违反了单一职责原则
// 2. 解决的方式非常简单, 根据交通工具运行的方式不同, 分解为不同的类即可
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行...");
    }
}
