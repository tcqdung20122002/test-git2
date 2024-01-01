import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<PhepCong> lst = new ArrayList<PhepCong>();
		Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Nhập số thực");
            System.out.println("2. Nhập phân số");
            System.out.println("3. Nhập số phức");
            System.out.println("4. Tính tổng từng kiểu số");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                	SoThuc a = new SoThuc();
                	a.nhap();
                	lst.add(a);
                    break;
                case 2:
                    PhanSo b = new PhanSo();
                    b.nhap();
                    lst.add(b);
                    break;
                case 3:
                	SoPhuc c = new SoPhuc();
                	c.nhap();
                	lst.add(c);
                    break;
                case 4:
                	int sothucCount = 0;
                	int phanSoCount = 0;
                    int soPhucCount = 0;
                    
                    for (PhepCong phepCong : lst) {
                    	if (phepCong instanceof SoThuc){
                    		sothucCount++;
                    	} else if (phepCong instanceof PhanSo) {
                            phanSoCount++;
                        } else if (phepCong instanceof SoPhuc) {
                            soPhucCount++;
                        }
                    }

                    if (sothucCount >= 2) {
                        SoThuc first = null;
                        SoThuc second = null;

                        for (PhepCong phepCong : lst) {
                            if (phepCong instanceof SoThuc) {
                                if (first == null) {
                                    first = (SoThuc) phepCong;
                                } else if (second == null) {
                                    second = (SoThuc) phepCong;
                                }
                            }
                        }

                        SoThuc result = (SoThuc) first.add(second);
                        System.out.println("Tổng 2 số thực: " + result.sothuc);
                    } else {
                        System.out.println("Cần ít nhất 2 số thực để tính tổng.");
                    }
                    
                    if (phanSoCount >= 2) {
                        PhanSo firstPhanSo = null;
                        PhanSo secondPhanSo = null;

                        for (PhepCong phepCong : lst) {
                            if (phepCong instanceof PhanSo) {
                                if (firstPhanSo == null) {
                                    firstPhanSo = (PhanSo) phepCong;
                                } else if (secondPhanSo == null) {
                                    secondPhanSo = (PhanSo) phepCong;
                                }
                            }
                        }

                        PhanSo resultPhanSo = (PhanSo) firstPhanSo.add(secondPhanSo);
                        System.out.println("Tổng 2 phân số: " + resultPhanSo.tuso + "/" + resultPhanSo.mauso);
                    } else {
                        System.out.println("Cần ít nhất 2 phân số để tính tổng.");
                    }

                    if (soPhucCount >= 2) {
                        SoPhuc firstSoPhuc = null;
                        SoPhuc secondSoPhuc = null;

                        for (PhepCong phepCong : lst) {
                            if (phepCong instanceof SoPhuc) {
                                if (firstSoPhuc == null) {
                                    firstSoPhuc = (SoPhuc) phepCong;
                                } else if (secondSoPhuc == null) {
                                    secondSoPhuc = (SoPhuc) phepCong;
                                }
                            }
                        }
                        SoPhuc resultSoPhuc = (SoPhuc) firstSoPhuc.add(secondSoPhuc);
                        System.out.println("Tổng 2 số phức: " + resultSoPhuc.phanthuc + "+" + resultSoPhuc.phanao + "i");
                    } else {
                        System.out.println("Cần ít nhất 2 số phức để tính tổng.");
                    }
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}
