package _01singleresponsibility;

/**
 * @author Archie Cheng
 * @version V1.0.0
 * @projectName Design Pattern
 * @title SingleResponsibility2
 * @package singleresponsibility
 * @description
 * @date 2024/5/8 11:36
 * @copyright 2024
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        roadVehicle.run("摩托车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

    }
}

// 方案2的一个分析
// 1. 遵守了单一职责原则
// 2. 但是这样做改动很大, 即需要将类分解, 同时修改客户端
// 3. 改进: 直接修改 Vehicle 类, 改动的代码会比较少
class RoadVehicle {
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行....");
    }
}

class AirVehicle {
    public void run(String vehicle){
        System.out.println(vehicle + "在天上上运行....");
    }
}

class WaterVehicle {
    public void run(String vehicle){
        System.out.println(vehicle + "在水中上运行....");
    }
}
