import java.util.Scanner;
class love{
 public static void bentuk(int a){
	 int b=a+a;
	 for(int i=4;i<a;i++){
		 
		 for(int j=a;j>=i;j--){
			 System.out.print(" ");
		 }
		 for(int j=0;j<=i;j++){
			 if(i==0&&j==0&&i==1){
				System.out.print(" "); 
			 }else{
				 System.out.print("* ");
			 }
		 }
		 for(int j=i;j<=a-1;j++){
			 if(i==1&&i==2){
				 
				 System.out.print(" ");
			 }else{
				 System.out.print("  ");
			 } 
		 }
		 for(int j=0;j<=i;j++){
			 if(i==0&&j==0&&i==1){
				System.out.print("  "); 
			 }else{
				 System.out.print("* ");
			 }
		 }
		 System.out.println();
	 }
	 for(int i=0;i<=b;i++){
		 for(int j=0;j<=i;j++){
			 System.out.print(" ");
		 }
		 for(int j=b;j>=i;j--){
			 System.out.print(" *");
		 }
		 System.out.println();
	 }
	 
 }
 public static void main(String []args){
	int a;
	Scanner input=new Scanner(System.in);
	System.out.print("silahkan masukkan angka:");a=input.nextInt();
	 bentuk(a);
	 
	 
 }	 
}