package bot;


import java.util.Scanner;

class Tamjung {
  private Scanner sc;
  private String botName;
  private int createdYear;

  public Tamjung(String botName, int createdYear) {

    this.sc = new Scanner(System.in);
    this.botName = botName;
    this.createdYear = createdYear;
  }
   
  void greeting() {
    System.out.printf("สวัสดีฉันชื่อ[%s]\n",botName);
    System.out.printf("ฉันถูกสร้างมาเมื่อ[%d]%n",createdYear);
    String Username ; 
    System.out.print("เธอชื่ออะไร?\n> ");
    Username = sc.nextLine();
    System.out.printf("สวัสดี [%s]!",Username);
    
  }
  
  void guessAge() {
     System.out.println("ฉันจะเดาว่าอายุเธอเท่าไร\nช่วยบอก เศษที่ได้จากการหารอายุของเธอด้วย 3 5 และ 7");
     int one , two , tree;
     System.out.print("> ");
     one = sc.nextInt() ;
     System.out.print("> ");
     two = sc.nextInt() ;
     System.out.print("> ");
     tree = sc.nextInt();

     int age=((one*70+two*21 +tree*15)%105);
     System.out.printf("เธออายุ %d :เป็นช่วงที่หน้าสนุกในชีวิตเลย!%n",age);
     

  }

  void countNumber() {
    System.out.println("ตอนนี้ ฉันจะแสดงให้เธอเห็นว่าฉันนับเลข 1-100ได้นะ");
    System.out.print("เธอต้องการให้ฉันนับถึงเลขอะไร?\n> ");
    int maximum = sc.nextInt();
    for(int i = 1 ; i<= maximum;i++){
      System.out.printf("%d!%n",i);

    }


   }

  void quiz() {
    System.out.println("ฉันขอทดสอบความรู้เกี่ยวกับการเขียนโปรแกรมของเธอหน่อยนะ");
    
    

      System.out.print("ทำไมเราถึงต้องใช้ method?\nก.เพื่อรันคำสั่งซ้ำหลายๆครัง\nข.เพื่อแบ่งโปรแกรมออกเป็น subroutine เล็กๆ หลายๆ รูทีน\nค.เพื่อวัดเวลาการรันโปรแกรม\nง.เพื่ออินเตอร์รัพการทำงานของโปรแกรมฃ\n> ");
      
      String choose = sc.nextLine();
      
      while(!choose.equals("ข")){
        System.out.println("ผิด! ลองใหม่อีกครั้งนะ");
        System.out.print("> ");
        choose = sc.nextLine();
        }
      System.out.println("ยินดีด้วย! เธอตอบถูก");
 
      }

  

  public static void main(String[] args) {
    Tamjung bot = new Tamjung("tamjung", 2020);
      
      bot.greeting();
      bot.guessAge();
      bot.countNumber();
      bot.quiz();
  }
}


