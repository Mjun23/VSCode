import java.util.Scanner;

public class Hello{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int age, withdraw, number;
        int bank_book = 10000;

        System.out.println("나이를 입력해 주세요 ");
        age = sc.nextInt();
        if(age > 20) {
            System.out.println("\n성인 이므로 사용이 가능");
            Thread.sleep(1000);
            System.out.println("\n몇초 후 은행 프로그램이 시작됩니다");
            Thread.sleep(5000);

            Systemin:
            {
            System.out.println("\n1. 출금 2. 입금 3. 내 통장\n숫자를 입력해주세요");
            number = sc.nextInt();
            if(number == 1){
                System.out.println("출금할 돈을 입력하세요");
                withdraw = sc.nextInt();
                if(withdraw <= bank_book){
                    System.out.println("잠시후에 돈이 출금됩니다");
                    Thread.sleep(3000);                   
                    System.out.println("/n정상적으로 출금 되었습니다\n통장에 남은돈은 " + (bank_book - withdraw) + " 원입니다");
                    bank_book = (bank_book - withdraw);
                }else{
                    System.out.println("통장에 있는 돈보다 출금하려는 금액이 큽니다");
                }
            }
    }
        }else {
            System.out.println("미성년자 이므로 사용이 불가");
        }
       sc.close();
    }
}