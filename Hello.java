import java.util.Scanner;

public class Hello{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int age, number;
        int bank_book = 10000;
        int while_open = 0;
        int deposit = 0;
        int withdraw = 0;

        System.out.println("나이를 입력해 주세요 ");
        age = sc.nextInt();
        if(age > 20) {
            System.out.println("\n성인 이므로 사용이 가능합니다");
            Thread.sleep(1000);
            System.out.println("\n몇초 후 은행 프로그램이 시작됩니다");
            Thread.sleep(5000);
            while(while_open == 0) {
                System.out.println("\n1. 출금 2. 입금 3. 내 통장 4. 시스템 종료\n숫자를 입력해주세요");
                number = sc.nextInt();
                switch(number){
                    case 1 :
                        System.out.println("출금할 돈을 입력하세요");
                        withdraw = sc.nextInt();
                        if(withdraw <= bank_book){
                            System.out.println("돈을 확인 중 입니다");
                            Thread.sleep(3000);
                            System.out.println("잠시후에 돈이 출금됩니다");
                            Thread.sleep(3000);                   
                            System.out.println("\n돈이 정상적으로 출금 되었습니다\n출금된 돈은 " + withdraw + "원이고\n통장에 남은돈은 " + (bank_book - withdraw) + "원입니다");
                                bank_book = (bank_book - withdraw);
                                withdraw = deposit;
                                break;
                            }else {
                                System.out.println("돈을 확인 중 입니다");
                                Thread.sleep(3000);
                                System.out.println("통장에 있는 돈보다 출금하려는 금액이 큽니다");
                                break;
                            }
                    case 2 :
                        System.out.println("입금할 돈을 입력하세요");
                        deposit = sc.nextInt();
                        if(bank_book + deposit <= 10000){
                            System.out.println("돈을 확인 중 입니다");
                            Thread.sleep(3000);
                            System.out.println("잠시후 돈이 입금됩니다");
                            Thread.sleep(3000);
                            bank_book = bank_book + deposit;
                            System.out.println("\n돈이 정상적으로 내 통장 에 입금 되었습니다\n지금 가지고 있는 현금 금액은 " + deposit + " 원 이고\n통장에 있는 돈은 " + bank_book + " 원 입니다");
                            break;
                        }else {
                            System.out.println("돈을 확인 중 입니다");
                            Thread.sleep(3000);
                            System.out.println("현금 보다 통장에 넣으려고 하는 금액이 더 많습니다");
                            break;
                        }
                    case 3 :
                    System.out.println("통장을 확인중입니다");
                    Thread.sleep(3000);
                    System.out.println("\n통장에는 " + bank_book + " 원이 있고\n현금으로는 " + withdraw + " 원이 있습니다");
                    break;
                    case 4 :
                    System.out.println("시스템을 종료합니다");
                    while_open = 1;
                    break;
                    default :
                            System.out.println("잘못 입력하셨습니다");
                            break;
                            }        
                    }
        }else {
            System.out.println("미성년자 이므로 사용이 불가합니다");
        }
       sc.close();
    }
}
