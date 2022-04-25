public class Account {
	private int id;
	private String name;
	private int balance = 0;

	public Account(int id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}
    
	public void naptien( int amount) {
		balance += amount;
	}
    public void bandau() {
		System.out.println("So du ban dau: " + balance);
	}
	public void tongtien() {
		System.out.println("So du hien tai: " + balance);
	}
	public void display() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("So du: " + balance);
	}
}