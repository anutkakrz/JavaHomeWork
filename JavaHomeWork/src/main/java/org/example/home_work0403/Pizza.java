package org.example.home_work0403;

public class Pizza {
    double d1;
    double d2;
    double calories;

    public void countOverCalories(double d1,double d2,double calories){

        double square1 = Math.PI*d1/2*d1/2;
        double square2 = Math.PI*d2/2*d2/2;
        double overCalories = (square2-square1)*calories;
//        String result = "В пице диаметром "+d2+" на "+overCalories+" больше каллорий, " +
//                "чем в пицце диаметром "+d1;
//        return result;
        System.out.println("B пицце диаметром "+d2+" на "+overCalories+" больше каллорий, " +
           "чем в пицце диаметром "+d1);


    }
}
