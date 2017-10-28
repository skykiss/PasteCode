package club.owtware.util;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomNumber {

    public static Integer getRandom(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String date = sdf.format(new Date());
        date = date.substring(2);
        Random rand = new Random();
        Integer d = Integer.valueOf(date);
        return d*10000+rand.nextInt(10000);
    }

}
