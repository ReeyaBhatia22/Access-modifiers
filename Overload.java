class overload
{
  int id;
  String name;
  float stipend; 

  overload(){}
  overload(int id, String name){
this.id=id;
this.name=name;
}
overload(int id, String name, float stipend){
this.id=id;
this.name=name;
this.stipend=stipend;
}
void displayDetails(){
System.out.println(this.name+"|"+this.id+"|"+this.stipend+"|");
}
}
class Main
{
   public static void main(String[]args)
   {
    overload ot1= new overload(); 
    overload ot2= new overload(45,"Aashish");
    overload ot3= new overload(234,"Cody",10000); 


    ot1.displayDetails();
    ot2.displayDetails();
    ot3.displayDetails();

   }
}

