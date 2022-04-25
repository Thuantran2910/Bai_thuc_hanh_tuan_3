import java.util.Scanner; 
public class MainAccount {
	public static void main(String[] args) {
		Account acc = new Account(12345, "Khach hang", 2000);
        int a,amount;
        boolean flag = true;
        Scanner ip= new Scanner(System.in);
        do {
            System.out.println("1.Thong tin khach hang\n");
            System.out.println("2.Nap tien\n");
            System.out.println("3.Thoat\n");
            System.out.println("Nhap yeu cau: ");
            a = ip.nextInt();
            switch(a){
                case 1: System.out.println("Thong tin khach hang");
                        acc.display(); break;
                case 2: System.out.println("Nap tien\n");
                        System.out.print("Nhap so tien nap: ");
                        amount = ip.nextInt(); 
                        acc.bandau(); 
                        acc.naptien(amount); 
                        acc.tongtien();
                        break;
                default:
                        System.out.println("Bye");
                        flag = false;
                        break;
            }

        }while(flag);
                    
		

		
	}
}