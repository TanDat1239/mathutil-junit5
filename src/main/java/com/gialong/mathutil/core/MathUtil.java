/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gialong.mathutil.core;

/**
 *
 * @author admin
 */
public class MathUtil {
    public static long getFunction(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0 and 20");
        if(n == 0 || n == 1)
            return 1;
        return n * getFunction(n - 1); //đệ quy
    }
}
