package pertemuan5;

class animal{
    void eat(){
        System.out.println("selamat makan");
    }
}

final class  dog extends animal{
    void bark(){
        System.out.println("gukgukguk");
      }
    }

class cat extends animal{
    void meow(){
        System.out.println(" belajar java");
    }
}

class praktikum5{
    public static void main(String args[]){
        dog c = new dog();
        c.bark();
        c.eat();
    }
} 
