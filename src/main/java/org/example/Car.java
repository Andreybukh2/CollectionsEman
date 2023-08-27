package org.example;

import java.util.ArrayList;
import java.util.List;
    public class Car {
        protected List wheels;
        public Car() throws WheelsException{
            wheels = new ArrayList();
            String[] strings = loadWheelNamesFromDB();
            if(strings.length==4){
                for (String str: strings) {
                    Wheel wheel = Wheel.valueOf(str);
                    wheels.add(wheel);
                }
            }
            else{
                throw new WheelsException();
            }
        }
        protected String[] loadWheelNamesFromDB() {
            return new String[]{"ПЕРЕДНЕЕ_ЛЕВОЕ", "ПЕРЕДНЕЕ_ПРАВОЕ", "ЗАДНЕЕ_ЛЕВОЕ", "ЗАДНЕЕ_ПРАВОЕ"};
        }
        
    public static void main(String[] args) throws WheelsException {
        Car car = new Car();
        System.out.println(car.wheels);
    }
}
