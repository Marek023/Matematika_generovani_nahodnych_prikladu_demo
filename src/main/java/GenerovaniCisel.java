import java.util.Random;

public class GenerovaniCisel {
    Random random = new Random();


    public int doSta() {
        return  random.nextInt(100);

    }

    public int doStaProDeleniBezNuly() {
        return  random.nextInt(99)+1;

    }

    public int doTisice(){
        return  random.nextInt(1000);
    }

    public int odTisiceDoMega(){
        return random.nextInt(1000000-100000)+100000;
    }







}

