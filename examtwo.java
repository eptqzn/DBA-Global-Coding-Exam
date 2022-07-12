public class examtwo {

   public static void main(String[] args)

{
   int i , j;
   for (i = 1; i <= 6; i++) {
    /* Inner for loop prints numbers of one row */
    for (j = 1; j <= i; j++) {
        System.out.print(i + " ");
    }
    System.out.print("\n");

    }
}
}