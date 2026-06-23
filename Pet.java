import java.util.*;
abstract class Animal{
abstract void display();
}
class dog extends Animal{
void display(){
System.out.println("BOW BOW");
}
}
class cat extends Animal{
void display(){
System.out.println("MEOW MEOW");
}
}
class Pet{
public static void main(String[] args){
dog d=new dog();
cat c=new cat();
d.display();
c.display();
}
}