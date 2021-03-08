package com.knoldus;

import java.util.stream.LongStream;

public class NumberRange implements NumberRange_Interface {
    @Override
    public long getProductOfRange(long number1, long number2) {

        long getProduct = LongStream.rangeClosed(number1, number2).reduce(1, (rangeLow, rangeUpper) -> rangeLow * rangeUpper);

        return getProduct;
    };


}