package week3;

import java.math.BigDecimal;

class BigDecimalExample{
    public static void main(String[] args){
        BigDecimal number = BigDecimal.ZERO;

        for (int i = 0; i < 10; i++){
            number = number.add(new BigDecimal("0.1"));
        }
        
        System.out.print(number);
    }
}

// The output is 1.0