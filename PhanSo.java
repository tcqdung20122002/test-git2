import java.util.Scanner;

public class PhanSo implements PhepCong{
	int tuso;
	int mauso;
	public PhanSo() {
		super();	
	}
	public PhanSo(int tuso, int mauso){
		super();
		this.tuso = tuso;
		this.mauso = mauso;
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tử số:");
		this.tuso = sc.nextInt();
		System.out.print("Nhập mẫu số:");
		this.mauso = sc.nextInt();
	}
	public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
	@Override
	public Object add(Object o) {
		// TODO Auto-generated method stub
		PhanSo kq = new PhanSo();		
		PhanSo sp = (PhanSo) o;
		kq.tuso = this.tuso * sp.mauso + sp.tuso * this.mauso;
        kq.mauso = this.mauso * sp.mauso;
        int i = timUSCLN(kq.tuso, kq.mauso);
        kq.tuso = kq.tuso/i;
        kq.mauso = kq.mauso/i;
		return kq;
	}
}
