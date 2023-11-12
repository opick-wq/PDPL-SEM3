package pertemuan6;
class bike{
    int speedlimit = 150;
}


public class praktikum6 extends bike{
    int speedlimit = 90;
    public static void main(String args[]){
        bike obj = new praktikum6();
        System.out.println(obj.speedlimit);
    }
}

