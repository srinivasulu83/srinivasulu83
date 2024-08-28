package p1;
public class WithDraw implements Transaction{
	public void process(int amt) {
		if(amt<b.bal) {
			System.out.println("Amt WithDrawn:"+amt);
			b.bal=b.bal-amt;
			System.out.println("Balance amt:"+b.getBalance());
			System.out.println("Transaction successfull...");
			}else {
				System.out.println("Insufficient fund...");
		}
	}

}
