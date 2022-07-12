import java.util.Scanner;

public class examthree

{

 public static void main(String args[]) {

   Scanner input = new Scanner(System.in);

   double NMales;

   double NFemales;

   double totalNew, totalP, totalR;
   
   double PMales;

   double PFemales;

   double RMales;

   double RFemales;

   double MP, FP;

   double MP1, FP1;

   double MP2, FP2;

   System.out.print("Enter the number of newly hired males: ");

   NMales = input.nextInt();
   
   System.out.print("Enter the number of newly hired females: ");

   NFemales = input.nextInt();

   totalNew = NMales + NFemales;

   MP = ((NMales / totalNew) * 100);

   FP = ((NFemales / totalNew) * 100);

   System.out.print("Enter the number of permanent position males: "); 

   PMales = input.nextInt();
   
   System.out.print("Enter the number of permanent position females: ");

   PFemales = input.nextInt();

   totalP = NMales + NFemales;

   MP1 = ((PMales / totalP) * 100);

   FP1 = ((PFemales / totalP) * 100);

   System.out.print("Enter the number of resigned males: "); 

   RMales = input.nextInt();
   
   System.out.print("Enter the number of resigned females: ");

   RFemales = input.nextInt();

   totalR = RMales + RFemales;

   MP2 = ((RMales / totalR) * 100);

   FP2 = ((RFemales / totalR) * 100);

   System.out.println("===");

   System.out.println("Thank you for the Information");

   System.out.println("===");

   System.out.println("Here is the Summary !!!");

   System.out.println("Number of hired employee = " + Math.round(totalNew));

   System.out.println("Male = " + Math.round(MP * 100.0) / 100.0 + "%");

   System.out.println("Female = " + Math.round(FP * 100.0) / 100.0 + "%");

   System.out.println("Number of Permanent Employee = " + Math.round(totalP));

   System.out.println("Male = " + Math.round(MP * 100.0) / 100.0 + "%");

   System.out.println("Female = " + Math.round(FP1 * 100.0) / 100.0 + "%");

   System.out.println("Number of Resigned Employee = " + Math.round(totalNew));

   System.out.println("Male = " + Math.round(MP * 100.0) / 100.0  + "%");

   System.out.println("Female = " + Math.round(FP2 * 100.0) / 100.0  + "%");

 }

}