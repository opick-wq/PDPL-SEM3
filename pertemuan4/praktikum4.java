package pertemuan4;

public class praktikum4 {
String name;
String breed;
int age;
String color;

public praktikum4(String name, String breed,
            int age, String color){
    this.name = name;
    this.breed = breed;
    this.age = age;
    this.color = color;
}

public String getName(){
    return name;
}

public String getBreed(){
    return breed;
}

public int getAge(){
    return age;
}

public String getColor(){
    return color;
}


public String tostring()
{
    return("Hi my name is"+ this.getName()+
    ".\nMy breed,age and color are"+
    this.getBreed()+","+ this.getAge()+
    "," + this.getColor());
}

    public static void main(String[] args) {
        praktikum4 tuffy = new praktikum4("tuffy","papillon", 5, "white");
        System.out.println(tuffy.tostring());
}
}
