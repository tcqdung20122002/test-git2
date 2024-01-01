import java.util.Scanner;

public class SoThuc implements PhepCong {

	int sothuc;
	public SoThuc() {
		super();
	}
	public SoThuc(int sothuc) {
		super();
		this.sothuc = sothuc;
	}
	void nhap()
	{
		System.out.print("Nhập số thực: ");
		Scanner sc = new Scanner(System.in);
		this.sothuc = sc.nextInt();
	}
	@Override
	public Object add(Object o) {
		// TODO Auto-generated method stub
		SoThuc kq = new SoThuc();
		SoThuc sp = (SoThuc) o;
		kq.sothuc = this.sothuc + sp.sothuc;
		return kq;
	}

}
