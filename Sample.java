import java.util.*;
class Sample{
public static void main(String[] args){
Encap e=new Encap();
e.setname("Sonzz");
System.out.println(e.getname());
}
}
class Encap{
private String name;
void setname(String s){
name=s;
}
public String getname(){
return name;
}
}

