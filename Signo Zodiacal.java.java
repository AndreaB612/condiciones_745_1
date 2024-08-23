import java.util.Scanner;

class SignoZodiacal {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int day = 23;
    int month = 08;
    int year = 2024;

    System.out.println("Hola, dime tu nombre");
    String name = leer.next();

    System.out.println(" "+name+" ingresa tu año de nacimiento (aaaa)");
    int year2 = leer.nextInt();
    System.out.println(" "+name+" ingresa tu mes de nacimiento (mm)");
    int month2 = leer.nextInt();
    
    if(year2<year)
    {
     int resta = year-year2;

     if(month2<month)
    { 
     int resta = month-month2;
     System.out.println(" "+name+ tu edad es "+resta+" ");
    }
    else (month2>month)
    {
     int edad = resta-1;
     System.out.println("+name+ tu edad es "+edad+");
      }
    }
  }
}
