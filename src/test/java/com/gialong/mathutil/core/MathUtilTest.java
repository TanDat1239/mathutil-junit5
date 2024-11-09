/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.gialong.mathutil.core;

//import static là dành riêng cho những hàm static
//gọi hàm mà bỏ qua tên class, dùng * để gọi tát cả các hàm
import static com.gialong.mathutil.core.MathUtil.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author admin
 */
public class MathUtilTest {
    
    //chơi DDT, tách data ra khỏi câu lệnh kiểm thử, tham số hóa data này
    //vào trong câu lệnh kiểm thử
    
    //chuẩn bị bộ data
    public static Object[][] initData(){
        return new Integer[][]{
                                {1, 1},
                                {2, 2},
                                {5, 120},
                                {6, 120},
        };
    }
    
    @ParameterizedTest
    @MethodSource(value = "initData") //tên hàm cung cấp data test
    public void testGetFactorialGivenRightArgReturnsWell(int input, long expected){
        assertEquals(expected, getFunction(input));
    }
    
    
    //Bắt ngoại lệ khi đưa ra data cà chớn
    //@Test(expected = tên ngoại lệ.class) JUnit 4 dùng, JUnit 5 thì ko còn
    @Test
    public void testGetFactorialGivenWrongArgThrowException(){
        //biểu thức Lambda
        //hàm nhận tham số thứ 2 là 1 cái object/có code implement cáo
        //function interface tên là Executable - có 1 hàm duy nhất ko code
        //tên là execute()
        //chơi chậm
        
//        Executable exObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFunction(-5);
//            }
//        };
        

//        Executable exObject = () -> getFunction(-5);

        assertThrows(IllegalArgumentException.class, () -> getFunction(-5));
    }
}
