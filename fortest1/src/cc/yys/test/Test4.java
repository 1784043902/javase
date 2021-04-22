package cc.yys.test;

import com.sun.javafx.css.CalculatedValue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * 包名:cc.yys.test
 *
 * @author youyisen
 * 日期:2021-04-09  15-02-45
 */
public class Test4 {

    public static void main(String[] args) {

        calculateTime("9:30", "10:30");
    }

    public static void calculateTime(String start, String end){

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        try {
            Date parse = sdf.parse(start);
            Date parse1 = sdf.parse(end);
            if(parse.before(parse1) || parse.equals(parse1)){
                System.out.print(sdf.format(parse) + " ");
            }
            while(parse.before(parse1)){
                parse.setTime(parse.getTime() + 1000 * 60 * 10);
                if(parse.before(parse1) || parse.equals(parse1)){
                    System.out.print(sdf.format(parse) + " ");
                }
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
