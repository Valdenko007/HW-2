public class NameEncoderDecoder{
  
public String encode(String name){
  
         String a = name;
         String b ="NOTFORYOU" ;
         String c = "YESNOTFORYOU";
         String d = b+a+c;
         String e = d.strip();
  
      return e.replace("e","1")
              .replace("u","2")
              .replace("i","3")
              .replace("o","4")
              .replace("a","5");
  
  
}
  public String decode(String name){
         String a = name;
         String e = a.strip();
    
  return e.replace("1","e")
          .replace("2","u")
          .replace("3","i")
          .replace("4","o")
          .replace("5","a")
          .replace("YESNOTFORYOU","")
          .replace("NOTFORYOU","");
  
  }

  public static void main(String[] args){
    
    NameEncoderDecoder names = new NameEncoderDecoder();
    
    String encoder = names.encode("Crab");
    System.out.println("names.encode(\"Crab\") = " + encoder);
    
     String decoder = names.decode("Crab");
    System.out.println("names.decode(\"Crab\") = " + decoder);
    
    
  }

 
  
  
  

}