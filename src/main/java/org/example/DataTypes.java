package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DataTypes {
    public static  void main(String[] args){
/* two types of data types
   1 . Primitive -
`            Data Type	Size (in bytes)	Default Value	Range
             `byte	1	0	-128 to 127
`````````````short	2	0	-32,768 to 32,767
``````````````int	4	0	-2^31 to 2^31 - 1 (approximately -2.1 billion to 2.1 billion)
             long	8	0L	-2^63 to 2^63 - 1 (approximately -9.2 quintillion to 9.2 quintillion)
             float	4	0.0f	3.4 × 10^-38 to 3.4 × 10^38 (precision of 7 decimal digits)
             double	8	0.0d	1.7 × 10^-308 to 1.7 × 10^308 (precision of 15 decimal digits)
             char	2	'\u0000' (null character)	0 to 65,535 (for storing Unicode characters)
             boolean	1	false	true or false
`
   2 . Not Primitive -
          Array
          object
          string
        */
        String names = "John";
        int[] numbers = {1, 2, 3};

        System.out.println(Arrays.toString(numbers));

//        OBJECT:
        DataTypes cars = new DataTypes();


    }
}
